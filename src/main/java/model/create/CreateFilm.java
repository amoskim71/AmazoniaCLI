package model.create;

import model.Film;
import model.Product;

public class CreateFilm implements CreateProduct{

	@Override
	public Product create() {
		return new Film();
	}
	
}
