package ch03;

import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter month and year: ");
		int month = scanner.nextInt();
		int year = scanner.nextInt();

		switch (month) {
			case 1:
				System.out.printf("January %s has 31 days", year);
				break;
			case 2:
				int days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
				System.out.printf("February %s has %s days", year, days);
				break;
			case 3:
				System.out.printf("March %s has 31 days", year);
				break;
			case 4:
				System.out.printf("April %s has 30 days", year);
				break;
			case 5:
				System.out.printf("May %s has 31 days", year);
				break;
			case 6:
				System.out.printf("June %s has 30 days", year);
				break;
			case 7:
				System.out.printf("July %s has 31 days", year);
				break;
			case 8:
				System.out.printf("August %s has 31 days", year);
				break;
			case 9:
				System.out.printf("September %s has 30 days", year);
				break;
			case 10:
				System.out.printf("October %s has 31 days", year);
				break;
			case 11:
				System.out.printf("November %s has 30 days", year);
				break;
			case 12:
				System.out.printf("December %s has 31 days", year);
				break;
			default:
				System.out.println("incorrect month!");

		}
	}
}
