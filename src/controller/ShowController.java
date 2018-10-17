package controller;

import java.util.List;

import model.Product;
import view.ShowView;

public class ShowController extends Controller{
	
	private List<Product> model;
	private ShowView view;
	private boolean allProduct;
	private int categoryId;
	
	public ShowController(ShowView view, List<Product> model, boolean allProduct, int categoryId) {
		this.model = model;
		this.view = view;
		this.allProduct = allProduct;
		this.categoryId = categoryId;
	}

	@Override
	public void loadView() {
		if(allProduct) {
			view.printView(model);
		}else {
			view.printView(model, categoryId);
		}
	}
}
