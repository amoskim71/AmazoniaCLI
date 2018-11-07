package controller;

import java.util.List;
import java.util.Scanner;
import model.*;
import view.*;

public class ShowProductController extends Controller{

	private List<Product> model;
	private ShowProductView view;
	private int id;
	private String name;
	private Scanner input;
	private User user;
	
	public ShowProductController(ShowProductView view, List<Product> model, User user) {
		this.model = model;
		this.view = view;
		this.user = user;
		input = new Scanner(System.in);
	}
	
	public void loadProductFromIdView() {
		try {
			System.out.print("Input product id: ");
			this.id = input.nextInt();
		}catch(Exception e) {
			clearView();
			System.out.println("Input error!\n");
			loadProductFromIdView();
		}
		int i;
		for(i = 0; i < model.size(); i++) {
			if(this.id == model.get(i).getProductId()) {
				view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
				break;
			}
		}
		buy();
	}
	
	public void loadProductFromNameView() {
		try {
			System.out.print("Input product id: ");
			this.name = input.nextLine();
		}catch(Exception e) {
			clearView();
			System.out.println("Input error!\n");
			loadProductFromIdView();
		}
		int i;
		for(i = 0; i < model.size(); i++) {
			if(this.name.equals(model.get(i).getProductName())) {
				view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
			}
		}
		buy();
	}
	
	public void loadProductListView() {
		for(int i = 0; i < model.size(); i++) {
			view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
		}
		buy();
	}
	
	public void loadProductsFromCategory() {
		try {
			System.out.print("Input category id: ");
			this.id = input.nextInt();
		}catch(Exception e) {
			clearView();
			System.out.println("Input error!\n");
			loadProductFromIdView();
		}
		for(int i = 0; i < model.size(); i++) {
			if(id == model.get(i).getCategoryId()) {
				view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
			}
		}
		buy();
	}
	
	private void buy() {
		BuyController buy = new BuyController(new BuyView(), user, model);
		buy.loadView();
	}
}
