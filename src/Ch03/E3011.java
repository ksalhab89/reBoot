package Ch03;

import java.util.Scanner;

public class E3011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter month and year: ");
		int month = scanner.nextInt();
		int year = scanner.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		int numberOfDays;
		String monthName;

		switch (month) {
			case 1:
				monthName = "January";
				numberOfDays = 31;
				break;
			case 2:
				monthName = "February";
				numberOfDays = isLeapYear ? 29 : 28;
				break;
			case 3:
				monthName = "March";
				numberOfDays = 31;

				break;
			case 4:
				monthName = "April";
				numberOfDays = 30;

				break;
			case 5:
				monthName = "May";
				numberOfDays = 31;

				break;
			case 6:
				monthName = "June";
				numberOfDays = 30;
				break;
			case 7:
				monthName = "July";
				numberOfDays = 31;

				break;
			case 8:
				monthName = "August";
				numberOfDays = 31;

				break;
			case 9:
				monthName = "September";
				numberOfDays = 30;
				break;
			case 10:
				monthName = "October";
				numberOfDays = 31;
				break;
			case 11:
				monthName = "November";
				numberOfDays = 30;
				break;
			case 12:
				monthName = "December";
				numberOfDays = 31;
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + month);
		}

		System.out.println(monthName + " " + year + " had " + numberOfDays);
	}
}
