package model;

public class Product {
	
	private int productId;
	private String productName;
	private int categoryId;
	private int productStock;
	private double productPrize;
	
	private static int generateId;
	
	static {
		generateId = 0;
	}
	
	public Product(String productName, int categoryId, int productStock, double productPrize) {
		this.productId = ++generateId;
		this.productName = productName;
		this.categoryId = categoryId;
		this.productStock = productStock;
		this.productPrize = productPrize;
	}
	
	public Product() {
		
	}
	
	public void copyProduct(Product productToCopy) {
		this.productId = productToCopy.getProductId();
		this.productName = productToCopy.getProductName();
		this.categoryId = productToCopy.getCategoryId();
		this.productStock = productToCopy.getProductStock();
		this.productPrize = productToCopy.getProductPrize();
	}
	
	public boolean compareProduct(Product anotherProduct) {
		boolean equals = false;
		if(this.productId == anotherProduct.productId && this.categoryId == anotherProduct.categoryId) {
			equals = true;
		}
		return equals;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public double getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(int productPrize) {
		this.productPrize = productPrize;
	}
}
