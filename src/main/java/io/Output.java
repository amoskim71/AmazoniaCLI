package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
	
	private static FileWriter output;
	
	/**
	 * Write user in a specified file in the project directory.
	 * @param user
	 */
	public static void writeUser(User user) {
		try {
			output = new FileWriter(new File("./.data/.users"), true);
			output.write(user + "\n");
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write product in a specified file in the project directory.
	 * @param product
	 */
	public static void writeProduct(Product product) {
		try {
			output = new FileWriter(new File("./.data/.products"), true);
			output.write(product + "\n");
			output.close();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write category in a specified file in the project directory.
	 * @param category
	 */
	public static void writeCategory(Category category) {
		try {
			output = new FileWriter(new File("./.data/.category"), true);
			output.write(category + "\n");
			output.close();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
