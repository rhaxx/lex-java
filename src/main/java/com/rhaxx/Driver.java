package com.rhaxx;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.logging.log4j.Logger;

import com.rhaxx.exceptions.InvalidAgeException;
import com.rhaxx.exceptions.InvalidNameException;
import com.rhaxx.exceptions.InvalidPostException;
import com.rhaxx.helpers.AppHelper;
import com.rhaxx.helpers.LogHelper;
import com.rhaxx.models.Address;
import com.rhaxx.models.Applicant;
import com.rhaxx.models.Booking;
import com.rhaxx.models.Customer;
import com.rhaxx.models.InfyDanceRegistration;
import com.rhaxx.models.Intern;
import com.rhaxx.models.MyMath;
import com.rhaxx.models.PermanentEmployee;
import com.rhaxx.models.PigLatin;
import com.rhaxx.models.Point;
import com.rhaxx.models.Product;
import com.rhaxx.models.RRAccount;
import com.rhaxx.models.StudentInterface;
import com.rhaxx.models.Triangle;
import com.rhaxx.models.UndergraduateStudent;
import com.rhaxx.models.UniversePlanetarium;
import com.rhaxx.models.Validator;

public class Driver {

	final static Logger LOGGER = LogHelper.getLogger(Driver.class);

	public static void main(String[] args) {
		System.out.println("Command line argument is : " + args[0]);
		AverageSale();
		ReverseCalculator();
		LuckyNumber();
		CricketScore();
		DebuggingFibonacci();
		InfyTourney();

		Product phone = new Product();
		phone.displayDetails();

		UniversePlanetarium up = new UniversePlanetarium();
		up.bookSeat("rhaxx", 2);
		up.bookSeat("nate", 1000);

		Point p4 = new Point(2, 3);
		System.out.println(p4.distance());
		Point p5 = new Point(5, 6);
		System.out.println(p5.distance());
		System.out.println(p4.distance(p5));

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

		UndergraduateStudent ajay = new UndergraduateStudent("ajay");
		ajay.setTestScore(0, 70);
		ajay.setTestScore(1, 69);
		ajay.setTestScore(2, 71);
		ajay.setTestScore(3, 5);
		ajay.generateResult();
		System.out.println("Name: " + ajay.getName() + " Result: " + ajay.getResult());

		StudentInterface rexInt = new Intern(150, 200);
		rexInt.calculatePercentage();

		int[] data = { 2, 4, 5, 7, 6 };
		System.out.println("Mean is : " + MyMath.mean(data) + " SD is : " + MyMath.deviation(data));

		Applicant applicant = new Applicant("Rex", "wrong", 23); // triggers invalidPostException and writes it to
																	// ErrorLog
		Validator validator = new Validator();
		try {
			validator.validate(applicant);
		} catch (InvalidNameException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (InvalidPostException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (InvalidAgeException e) {
			LOGGER.error(e.getMessage(), e);
		}

		System.out.println(AppHelper.PROPERTIES.getProperty("SUCCESS"));

		LOGGER.info("Testing logging"); // directly testing LOGGING

		Customer cust = new Customer();
		cust.findDiscountAndName("Regular:Rhaxx");

		PigLatin pl = new PigLatin();
		pl.pigLatinConverter("rexut");

		System.out.println(isPasswordValid("ReXa123"));

		System.out.println(isValidWebAddress("www.google.com"));
		System.out.println(isValidWebAddress("google.com"));
		System.out.println(isValidWebAddress("https://www.google.com"));
		System.out.println(isValidWebAddress("http://www.google.com"));
		System.out.println(isValidWebAddress("aosmoasognaosngkas_(@*(#.com"));

		List<String> orders = new ArrayList<String>();
		orders.add("Tortilla");
		orders.add("Sandwich");
		orders.add("Fried rice");
		orders.add("Pasta");
		orders.add("Burger");
		orders.add("Pizza");
		orders.add("Pasta");
		orders.add("Burger");

		// Check whether orders contain any item
		if (orders.isEmpty()) {
			System.out.println("No orders available!!");
		}

		// Display the number of orders in the list
		System.out.println("Numbers of orders: " + orders.size());

		List<String> newOrders = new ArrayList<String>();
		newOrders.add("Tortilla");
		newOrders.add("Cutlet");
		newOrders.add("Fried Egg");

		// Adding this newOrders list into the existing orders
		orders.addAll(newOrders);

		// Removing "Burger" item from the orders
		orders.remove("Burger");

		// Removing first item from the orders
		orders.remove(0);

		// Display all orders
		System.out.println("The items available in the order are: ");
		System.out.println("========================================");
		for (String order : orders) {
			System.out.println(order);
		}
		System.out.println("========================================");

		// Checking whether Pasta is ordered or not
		if (orders.contains("Pasta")) {
			System.out.println("Pasta is ordered already!!!");
		} else {
			System.out.println("No Pasta ordered!!");
		}

		// Converting list to array
		Object[] ordersArray = orders.toArray();
		for (Object obj : ordersArray) {
			System.out.println(obj);
		}

		// Deleting all the items from the orders
		orders.clear();

		System.out.println(orders.isEmpty());

		Set<String> s = new TreeSet<String>();
		s.add("4");
		s.add("8");
		Iterator<String> itr = s.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");

		// Sample list of orders
		orders.add("Tortilla");
		orders.add("Sandwich");
		orders.add("Fried rice");
		orders.add("Pasta");
		orders.add("Burger");
		orders.add("Pizza");
		orders.add("Pasta");
		orders.add("Burger");

		Map<String, Integer> itemMap = new HashMap<String, Integer>();

		for (String item : orders) {
			if (itemMap.containsKey(item)) {
				itemMap.put(item, itemMap.get(item) + 1);
			} else
				itemMap.put(item, 1);
		}

		// Today's date
		LocalDate today = LocalDate.now();
		System.out.println("Today's date is " + today);

		// Change to your birthday (year, month, dayOfMonth)
		LocalDate yourDOB = LocalDate.of(1995, 8, 25);
		System.out.println("Your birthday is on " + yourDOB);

		// Your age
		System.out.println("Your age is " + yourDOB.until(today, ChronoUnit.YEARS) + " years");

		// Change to your friend's birthday (year, month, dayOfMonth)
		LocalDate yourFriendsDOB = LocalDate.of(1996, 3, 15);
		String olderOrYounger = yourDOB.isAfter(yourFriendsDOB) ? "younger" : "older"; // Using ternary operator
		System.out.println("You are " + olderOrYounger + " than your friend");

		// Is this a leap year?
		System.out.println("This is a leap year: " + today.isLeapYear());

		// This month
		System.out.println("This month is " + today.getMonth());

		// This day
		System.out.println("Today is " + today.getDayOfWeek());

		// 4 days from today
		System.out.println("4 days from today will be " + today.plusDays(4).getDayOfWeek());

		LocalDate date = LocalDate.of(2017, 07, 21);
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
		String swipeInTime = "Tuesday, Aug 16, 2016 12:10:56 PM";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, MMM d, yyyy hh:mm:ss a");

		LocalDate dob = LocalDate.of(1996, 12, 28);
		LocalDate now = LocalDate.now();
		int year = now.getYear() - dob.getYear();
		int month = now.getMonthValue() - dob.getMonthValue();
		int dayOfMonth = now.getDayOfMonth() - dob.getDayOfMonth();

		if (dayOfMonth < 0) {
			if (month < 0) {
				year = now.getYear() - dob.getYear() - 1;
				month = -month - 1;
				dayOfMonth = -dayOfMonth;
				System.out.println(year + " " + month + " " + dayOfMonth);
			} else {
				year = now.getYear() - dob.getYear();
				dayOfMonth = -dayOfMonth;
				System.out.println(year + " " + month + " " + dayOfMonth);
			}
		}
		LocalDate age = LocalDate.of(year, month, dayOfMonth);
		System.out.println(age.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));

		String examStartString = "24 August, 2017, 9:30 AM";
		String examEndString = "24 August, 2017, 11:30 AM";
		// Code here
		try {
			System.out.println(isValidExamDateTime(examStartString, examEndString));
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(21);
		list.add(10);
		list.add(5);
		list.sort( (arg1, arg2) -> arg1.compareTo(arg2));

	    for (Integer i : list) System.out.println(i);
	}

	public static boolean isValidExamDateTime(String examStartString, String examEndString) throws Exception {
		// Code here
		LocalDateTime examStartObj = getDateTimeFromString(examStartString);
		LocalDateTime examEndObj = getDateTimeFromString(examEndString);
		LocalDateTime now = LocalDateTime.now();
		int hour = examStartObj.getHour();
		if (examStartObj.isBefore(now))
			throw new Exception("PAST_EXAM");
		if (examStartObj.getDayOfWeek() == DayOfWeek.SATURDAY || examStartObj.getDayOfWeek() == DayOfWeek.SUNDAY)
			throw new Exception("WEEKEND_DATE");
		if (examStartObj.isAfter(now.plusWeeks(1)))
			throw new Exception("DATE_AFTER_7_DAYS");
		if (examStartObj.plusHours(2) != examEndObj)
			throw new Exception("INVALID_DURATION");
		if (hour < 9 && hour > 12 || hour < 15 && hour > 18)
			throw new Exception("INVALID_SLOT");
		return true;
	}

	public static LocalDateTime getDateTimeFromString(String dateStr) {
		// Code here
		String pattern = "dd MMMM, yyyy, h:mm a";
		return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
	}

	public static boolean isAgeEligible(LocalDate dob) {
		LocalDate today = LocalDate.now();
		if (dob.until(today, ChronoUnit.YEARS) >= 50)
			return true;
		else
			return false;
	}

	public static LocalDate stringToLocalDate(String date) {
		String pattern = "dd-MMM-yyyy";
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
	}

	static void InfyTourney() {
		String[] cart = { "round-neck", "collared", "hooded", "round-neck", "round-neck" };
		float discount = 0;
		if (cart.length >= 5 && cart.length <= 10) {
			discount = 0.1F; // F at the end is for float
		} else if (cart.length > 10) {
			discount = 0.2F;
		}
		int totalCost = 0;
		for (String item : cart) {
			switch (item) {
			case "round-neck":
				totalCost += 200;
				break;
			case "collared":
				totalCost += 250;
				break;
			case "hooded":
				totalCost += 300;
				break;
			default:
				System.out.println("wrong item in cart");
				break;
			}
		}
		float finalAmount = (float) totalCost - (totalCost * discount);
		System.out.println("The final price is Rs. " + finalAmount);
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
		int aboveAvg = 0, equalAvg = 0, belowAvg = 0;
		for (int score : scores) {
			if (score == average) {
				equalAvg++;
				continue;
			}
			if (score < average) {
				belowAvg++;
				continue;
			}
			if (score > average) {
				aboveAvg++;
				continue;
			}
		}
		System.out.println("The average score of the team is " + average);
		System.out.println("No. of matches having score above average is " + aboveAvg);
		System.out.println("No. of matches having score equal average is " + equalAvg);
		System.out.println("No. of matchines having score below average is " + belowAvg);
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

	static boolean isPasswordValid(String password) {
		String regex = "[A-Za-z]{2,4}[0-9]{3}"; // 2 to 4 alphabetic with 3 numeric password
		return password.matches(regex);
	}

	static boolean isValidWebAddress(String webAddress) {
		String regex = "(https?:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.(com|org|net)";
		return webAddress.matches(regex);
	}

	static boolean isRegex(String blah) {
		String regex = "([^\\\\W]+)-[Infosys]+";
		return blah.matches(regex);
	}

	static void ageCalculator(LocalDate dob) {
		LocalDate now = LocalDate.now();
		int year = now.getYear() - dob.getYear();
		int month = now.getMonthValue() - dob.getMonthValue();
		int dayOfMonth = now.getDayOfMonth() - dob.getDayOfMonth();
		LocalDate age = LocalDate.of(year, month, dayOfMonth);
		System.out.println(age.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));

	}
}
