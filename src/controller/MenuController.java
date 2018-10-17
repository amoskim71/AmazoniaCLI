package controller;

import model.User;
import view.MenuView;
import view.ProfileView;

public class MenuController extends Controller{

	private MenuView view;
	private User model;
	
	public MenuController(MenuView view, User model) {
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void loadView() {
		view.printView(model.isAdmin());
		if(model.isAdmin()) {
			switch(view.getSelectOption()) {
			
				case "1":
					clearView();
					System.out.println("Exito");
					break; 
					
				case "2":
					clearView();
					break;
					
				case "3":
					clearView();
					break;
					
				case "4":
					clearView();
					break;
					
				case "5":
					clearView();
					break;
					
				default:
					clearView();
					System.out.println("Call function");
					loadView();
					break;
			}
		}else{
			switch(view.getSelectOption()) {
			
				case "1":
					clearView();
					System.out.println("User");
					loadView();
					break; 
					
				case "2":
					clearView();
					loadView();
					break;
					
				case "3":
					clearView();
					loadView();
					break;
					
				case "4":
					clearView();
					loadView();
					break;
					
				case "5":
					clearView();
					ProfileController profile = new ProfileController(new ProfileView(), model);
					profile.loadView();
					loadView();
					break;
					
				case "6":
					clearView();
					break;
				
				default:
					clearView();
					System.out.println("User input error");
					loadView();
					break;
			}
		}
		
	}

}
