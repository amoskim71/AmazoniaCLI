package model;

import java.math.BigDecimal;
import java.util.ArrayList;

import exception.EmptyStringException;
import exception.TooManyCharException;

/**
 * 
 * @author José Luis de la Hoz
 *
 */
public class Product{
	
	private String title;
	private BigDecimal averageRating;
	private ArrayList<Comment> commentBox;
	public static final int TITLE_LENGTH = 30;
	
	/**
	 * Return title product.
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Set product title only if is not empty or exceed maximum title length.
	 * @param title
	 * @throws EmptyStringException
	 * @throws TooManyCharException
	 */
	public void setTitle(String title) throws EmptyStringException, TooManyCharException{
		if(title.isEmpty()) {
			throw new EmptyStringException();
		}else if(title.length() > TITLE_LENGTH) {
			throw new TooManyCharException();
		}else {
			this.title = title;
		}
	}
	
}