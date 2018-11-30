package controller.new_thing;

import java.util.List;

import controller.Controller;
import model.Category;
import view.newThing.NewCategoryView;
import view.newThing.NewProductView;

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
