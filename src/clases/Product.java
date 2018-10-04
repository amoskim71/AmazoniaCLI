package clases;
public class Product {
	
	private int productId;
	private String productName;
	private int categoryId;
	private int productStock;
	private int productPrize;
	
	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	
	public boolean compareProduct(Product anotherProduct) {
		boolean equals = false;
		if(this.productId == anotherProduct.productId && this.productName.equals(anotherProduct.productName)
			&& this.categoryId == anotherProduct.categoryId && this.productStock == anotherProduct.productStock 
			&& this.productPrize == anotherProduct.productPrize) {
			equals = true;
		}
		return equals;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public int getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(int productPrize) {
		this.productPrize = productPrize;
	}
}
