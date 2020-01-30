package com.rhaxx.models;

public class Product {

	private int productId;
	private String productName;
	private float productPrice;
	private int productStock;

	public float getPriceAfterDiscount(int discountPercentage) {
		return productPrice - (productPrice * discountPercentage / 100);
	}

	public void displayDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
		if (productStock > 0) {
			System.out.println("Product Stock: " + productStock);
		} else {
			System.out.println("Out of stock!");
		}
	}

	public void displayDetails(int discountPercentage) {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Discounted Price: " + getPriceAfterDiscount(discountPercentage));
		if (productStock > 0) {
			System.out.println("Product Stock: " + productStock);
		} else {
			System.out.println("Out of stock!");
		}
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

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

}
