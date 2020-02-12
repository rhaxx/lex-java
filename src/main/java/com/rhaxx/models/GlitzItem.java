package com.rhaxx.models;

public class GlitzItem {

	private Integer itemId;
	private String itemName;
	private ItemType itemType;
	private float weightInGrams;
	private float price;

	public GlitzItem(Integer itemId, String itemName, ItemType itemType, float weightInGrams, float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.weightInGrams = weightInGrams;
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public float getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(float weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
