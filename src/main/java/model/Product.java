package model;

import java.util.ArrayList;

import exception.EmptyStringException;
import exception.TooManyCharException;

/**
 * 
 * @author José Luis de la Hoz
 *
 */
public abstract class Product{
	
	protected String title;
	protected double averageAssessment;
	protected ArrayList<Review> reviewList;
	protected Language language;
	protected Department department;
	
	public static final int TITLE_LENGTH = 30;
	
	enum Department {
		MUSIC, BOOKS, FILMS 
	}
	
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

	/**
	 * Get average assessment.
	 * @return
	 */
	public double getAverageAssessment() {
		setAverageAssessment();
		return averageAssessment;
	}

	/**
	 * Calculate average of all the reviews and store it in averageAssessment. 
	 */
	private void setAverageAssessment() {
		for(Review review: reviewList) {
			averageAssessment += review.getAssessment();
		}
		averageAssessment /= reviewList.size();
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}