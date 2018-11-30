package controller;

import java.util.List;

import model.*;
import view.*;

public class BuyController extends Controller{
	
	private BuyView view;
	private User model;
	private List<Product> search;
	
	public BuyController(BuyView view, User model, List<Product> search) {
		this.view = view;
		this.model = model;
		this.search = search;
	}
	
	public void loadView() {
		view.printInputProduct();
		boolean flag = false;
		if(view.getId() != 0) {
			for(int i = 0; i < search.size(); i++) {
				if(view.getId() == search.get(i).getProductId() && search.get(i).availableStock()) {
					if(search.get(i).getProductStock() - view.getAmount() >= 0) {
						flag = true;
						model.buyProduct(search.get(i), view.getAmount());
						break;
					}
				}
			}
		}
		if(!flag) {
			System.out.println("\nProduct not found or out of stock or too many products.");
			pauseUntilInput();
		}
	}
}
