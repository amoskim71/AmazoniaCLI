package controller;

import java.util.List;

import model.Category;
import view.NewCategoryView;
import view.NewProductView;

public class NewCategoryController extends Controller{

	private List<Category> categoryList;
	private NewCategoryView view;
	
	public NewCategoryController(NewCategoryView view, List<Category> productList) {
		this.categoryList = productList;
		this.view = view;
	}
	
	public void loadView() {
		try {
			view.printView();	
		}catch(Exception e){
			clearView();
			System.out.println("An error ocurred during input product. Please try again.\n");
			loadView();
		}
		
		categoryList.add(view.getCategory());
	}
	
}
