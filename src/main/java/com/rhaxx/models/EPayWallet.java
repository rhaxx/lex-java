package com.rhaxx.models;

public class EPayWallet {

	static void processPaymentByUser(User user, double billAmount) {
		if (user instanceof KYCUser) {
			KYCUser kyc = new KYCUser(user.getId(), user.getUsername(), user.getEmail(), user.getWalletBalance());
			if (kyc.makePayment(billAmount)) {
				System.out.println("Congratulations " + kyc.getUsername() + " your payment of " + billAmount + " was successful.");
			} else {
				System.out.println("Sorry " + kyc.getUsername() + ", not enough balance.");
			}
			System.out.println("You have " + kyc.getRewardPoints() + " points.");
		} else {
			if (user.makePayment(billAmount)) {
				System.out.println("Congratulations " + user.getUsername() + " your payment of " + billAmount
						+ " was successful.");
			} else {
				System.out.println("Sorry " + user.getUsername() + ", not enough balance.");
			}
		}
	}

}
