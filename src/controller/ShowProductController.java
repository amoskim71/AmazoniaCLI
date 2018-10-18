package controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import model.Product;
import view.ShowProductView;

public class ShowProductController extends Controller{

	private List<Product> model;
	private ShowProductView view;
	private int id;
	private Scanner input;
	
	public ShowProductController(ShowProductView view, List<Product> model) {
		this.model = model;
		this.view = view;
		input = new Scanner(System.in);
	}
	
	public void loadProductView() {
		try {
			System.out.print("Input product id: ");
			this.id = input.nextInt();
		}catch(Exception e) {
			clearView();
			System.out.println("Input error!\n");
			loadProductView();
		}
		for(int i = 0; i < model.size(); i++) {
			if(this.id == model.get(i).getProductId()) {
				view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
				break;
			}
		}
		pauseUntilInput();
	}
	
	public void loadProductListView() {
		for(int i = 0; i < model.size(); i++) {
			view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
		}
		pauseUntilInput();
	}
	
	public void loadProductsFromCategory() {
		try {
			System.out.print("Input category id: ");
			this.id = input.nextInt();
		}catch(Exception e) {
			clearView();
			System.out.println("Input error!\n");
			loadProductView();
		}
		for(int i = 0; i < model.size(); i++) {
			if(id == model.get(i).getCategoryId()) {
				view.printProduct(model.get(i).getProductName(), model.get(i).getProductPrize(), model.get(i).getProductStock(), model.get(i).getProductId());
			}
		}
		pauseUntilInput();
	}
}
