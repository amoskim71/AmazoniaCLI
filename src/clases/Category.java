package clases;

public class Category {
	
	private int categoryId;
	private String categoryName;
	
	private static int generateId;
	
	static {
		generateId = 0;
	}
	
	public Category(String categoryName) {
		this.categoryId = ++generateId;
		this.categoryName = categoryName;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
