package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Category;
import model.Product;
import model.User;

/**
 * 
 * Output class allow to write users, products and categories into files.
 * @author José Luis
 *
 */
public class Output {
	public static void setUsersToDataBase(ArrayList<User> userList) {
		try {
			FileOutputStream fileOutput = new FileOutputStream(new File("./.data/.users"));
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(userList);
			objectOutput.close();
		}catch(Exception e){
			
		}
	}
	
	public static void setProductsToDataBase(ArrayList<Product> productList) {
		try {
			FileOutputStream fileOutput = new FileOutputStream(new File("./.data/.products"));
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(productList);
			objectOutput.close();
		}catch(Exception e){
			
		}
	}
	
	public static void setCategoriesToDataBase(ArrayList<Category> categoryList) {
		try {
			FileOutputStream fileOutput = new FileOutputStream(new File("./.data/.categories"));
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(categoryList);
			objectOutput.close();
		}catch(Exception e){
			
		}
	}
}
