package model.create;

import model.Book;
import model.Product;

/**
 * CreateBook is responsible of create new Books.
 * @author joseluis
 *
 */
public class CreateBook implements CreateProduct{

	@Override
	public Product create() {
		return new Book();
	}
	
}
