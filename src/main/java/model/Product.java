package model;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int productId;
	private String productName;
	private int categoryId;
	private int productStock;
	private double productPrize;
	
	private static int generateId = 0;
	
	public Product(String productName, int categoryId, int productStock, double productPrize) {
		this.productId = ++generateId;
		this.productName = productName;
		this.categoryId = categoryId;
		this.productStock = productStock;
		this.productPrize = productPrize;
	}
	
	public Product() {
		
	}
	
	/**
	 * Copy all the attributes of the class Product from one product to another.
	 * 
	 * @param productToCopy
	 */
	public void copyProduct(Product productToCopy) {
		this.productId = productToCopy.getProductId();
		this.productName = productToCopy.getProductName();
		this.categoryId = productToCopy.getCategoryId();
		this.productStock = productToCopy.getProductStock();
		this.productPrize = productToCopy.getProductPrize();
	}
	
	/**
	 * Return true if two products have the same productId.
	 * 
	 * @param anotherProductx
	 * @return true if equals
	 */
	public boolean compareProduct(Product anotherProduct) {
		boolean equals = false;
		if(this.productId == anotherProduct.productId) {
			equals = true;
		}
		return equals;
	}
	
	/**
	 * Get product prize in dollars
	 * 
	 * @return prizes * 1.15 USD
	 */
	public double getPrizeUSD() {
		return getProductPrize() * 1.15;
	}
	
	/**
	 * if it is available stock return true
	 * 
	 * @return true if have more than 0 productStock
	 */
	public boolean availableStock() {
		boolean available = false;
		if(this.getProductStock() > 0) {
			available = true;
		}
		return available;
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

	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}
	
	@Override
	public String toString() {
		return productName + ";" + categoryId + ";" + productStock + ";" + productPrize;
	}
}
