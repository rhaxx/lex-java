package com.rhaxx.models;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
	
	private int id = 101;
	private String username = "Rex";
	private String email = "Rex@Infy.com";
	private double walletBalance = 1000.0;
	
	private double billAmount = 503.0;
	private double billAmountLarge = 1000000.0;
	
	private double delta = 0.00001;

	private User user = new User(id, username, email, walletBalance);
	
	@Test
	public void userArgsTest() {
		Assert.assertNotNull(user);
	}
	
	@Test
	public void getSetIdTest() {
		int newId = 000;
		user.setId(newId);
		Assert.assertEquals(user.getId(), newId);
	}
	
	@Test
	public void getSetUsernameTest() {
		String newUsername = "Rhaxx";
		user.setUsername(newUsername);
		Assert.assertEquals(user.getUsername(), newUsername);
	}
	
	@Test
	public void getSetEmailTest() {
		String newEmail = "Rhaxx@Infy.com";
		user.setEmail(newEmail);
		Assert.assertEquals(user.getEmail(), newEmail);
	}
	
	@Test
	public void getSetWalletBalanceTest() {
		double newWalletBalance = 2000.0;
		user.setWalletBalance(newWalletBalance);
		Assert.assertEquals(user.getWalletBalance(), newWalletBalance, delta);
	}
	
	@Test
	public void makePaymentTrueTest() {
		user.setWalletBalance(walletBalance);
		Assert.assertTrue(user.makePayment(billAmount));
		double actual = walletBalance - billAmount;
		Assert.assertEquals(user.getWalletBalance(), actual, delta);
	}
	
	@Test
	public void makePaymentFalseTest() {
		user.setWalletBalance(walletBalance);
		Assert.assertFalse(user.makePayment(billAmountLarge));
	}
}
