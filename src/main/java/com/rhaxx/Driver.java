package com.rhaxx;

import com.rhaxx.models.Address;
import com.rhaxx.models.Booking;
import com.rhaxx.models.InfyDanceRegistration;
import com.rhaxx.models.PermanentEmployee;
import com.rhaxx.models.Point;
import com.rhaxx.models.RRAccount;
import com.rhaxx.models.Triangle;

public class Driver {

	public static void main(String[] args) {
		// System.out.println("Command line argument is : " + args[0]);
		// AverageSale();
		// ReverseCalculator();
		// LuckyNumber();
		// CricketScore();
		// DebuggingFibonacci();
		// InfyTourney();

		// Product phone = new Product();
		// phone.displayDetails();

		// UniversePlanetarium up = new UniversePlanetarium();
		// up.bookSeat("rhaxx", 2);
		// up.bookSeat("nate", 1000);

		// Point p1 = new Point(2, 3);
		// System.out.println(p1.distance());
		// Point p2 = new Point(5, 6);
		// System.out.println(p2.distance());
		// System.out.println(p1.distance(p2));

		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 0);
		Point p3 = new Point(3, 4);

		Triangle tri = new Triangle(p1, p2, p3);
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getArea());

		Booking booking1 = new Booking("rex@infy.com", 90);
		booking1.showBookingStatus();
		System.out.println(booking1.getSeatsAvailable());

		InfyDanceRegistration idr = new InfyDanceRegistration("Rex", 9999999999L, "yonkers");
		InfyDanceRegistration idr2 = new InfyDanceRegistration("Rex", 9999999999L, "yonkers");
		InfyDanceRegistration idr3 = new InfyDanceRegistration("Rex", 9999999999L, "yonkers");
		InfyDanceRegistration idr4 = new InfyDanceRegistration("Rex", 9999999999L, "yonkers");

		PermanentEmployee anil = new PermanentEmployee(101, "anil", 0, 10000, 1500, 3);
		System.out.println(anil.toString()); // salary to start is 0^
		anil.calculateSalary(); // this will set the correct salary
		System.out.println(anil.toString()); // check the salary now

		Address address = new Address("No. 123", "9th Cross, Trinethra Circle", "Mysuru", "Karnataka", 70017);
		RRAccount rexRRA = new RRAccount("Rakesh", address, 50000.00);
		System.out.println(rexRRA.toString()); // the address should be incorrect because 70017 is not 6 digits
		Address address2 = new Address("No. 123", "9th Cross, Trinethra Circle", "Mysuru", "Karnataka", 700171);
		RRAccount rexRRA2 = new RRAccount("Rakesh", address2, 50000.00); // using the new address
		System.out.println(rexRRA2.toString());
	}

	static void InfyTourney() {
		String[] cart = { "round-neck", "collared", "hooded", "round-neck", "round-neck" };
		float discount = 0;
		if (cart.length >= 5 && cart.length <= 10) {
			discount = 0.1F; // F at the end is for float
		} else if (cart.length > 10) {
			discount = 0.2F;
		}
		int total_cost = 0;
		for (String item : cart) {
			switch (item) {
			case "round-neck":
				total_cost += 200;
				break;
			case "collared":
				total_cost += 250;
				break;
			case "hooded":
				total_cost += 300;
				break;
			default:
				System.out.println("wrong item in cart");
				break;
			}
		}
		float final_amount = (float) total_cost - (total_cost * discount);
		System.out.println("The final price is Rs. " + final_amount);
	}

	static void DebuggingFibonacci() {
		int fibCount = 6;
		int no1 = 0, no2 = 1;
		for (int i = 0; i < fibCount; i++) {
			if (i == 0) {
				System.out.print(0 + " ");
			} else if (i == 1) {
				System.out.print(1 + " ");
			} else if (i >= 2) {
				int no3 = no1 + no2;
				System.out.print(no3 + " ");
				no1 = no2;
				no2 = no3;
			}
		}
	}

	static void CricketScore() {
		int[] scores = { 281, 344, 265, 272, 236, 324, 287 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		float average = (float) sum / scores.length;
		int above_avg = 0, equal_avg = 0, below_avg = 0;
		for (int score : scores) {
			if (score == average) {
				equal_avg++;
				continue;
			}
			if (score < average) {
				below_avg++;
				continue;
			}
			if (score > average) {
				above_avg++;
				continue;
			}
		}
		System.out.println("The average score of the team is " + average);
		System.out.println("No. of matches having score above average is " + above_avg);
		System.out.println("No. of matches having score equal average is " + equal_avg);
		System.out.println("No. of matchines having score below average is " + below_avg);
	}

	static void AverageSale() {
		int sum = 0, count = 0;
		int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };
		for (int sale : sales) {
			sum += sale;
		}
		float average = (float) sum / sales.length;
		for (int sale : sales) {
			if (sale > average) {
				count++;
			}
		}
		System.out.println("Average sale: " + average);
		System.out.println("Sales above average: " + count);
	}

	static void ReverseCalculator() {
		String input = "27";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println("The reverse of the number using for loop is : " + output);
		output = "";
		if (input.length() > 0) {
			int i = input.length() - 1;
			do {
				output += input.charAt(i);
				i--;
			} while (i >= 0);
		}
		System.out.print("The reverse of the number using a do-while loop is : " + output);
	}

	static void LuckyNumber() {
		// String input = "1623"; // lucky
		String input = "1523";
		int output = 0;
		for (int i = 0; i < input.length(); i++) {
			if (i == 0) {
				continue;
			} else if (i % 2 != 0) {
				output += ((int) input.charAt(i) - 48) * ((int) input.charAt(i) - 48); // ascii to decimal value
			}
		}
		if (output % 9 == 0) {
			System.out.println("The number " + input + " is a lucky number!");
		} else {
			System.out.println("OOOOOPS! Not a lucky number");
		}
	}
}
