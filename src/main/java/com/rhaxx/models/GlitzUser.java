package com.rhaxx.models;

import java.util.List;

public class GlitzUser {

	private String username;
	private List<GlitzItem> itemList;
	private float billAmount;

	public GlitzUser(String username, List<GlitzItem> itemList, float billAmount) {
		this.username = username;
		this.itemList = itemList;
		this.billAmount = billAmount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<GlitzItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<GlitzItem> itemList) {
		this.itemList = itemList;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

}
