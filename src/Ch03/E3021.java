package Ch03;

import java.util.Scanner;

public class E3021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter year (e.g., 2012) ");
		int year = scanner.nextInt();

		System.out.print("Enter month 1-12 ");
		int month = scanner.nextInt();

		System.out.print("Enter the day of the month 1-31 ");
		int q = scanner.nextInt();

		year = month <= 2 ? --year : year;
		int m = month <= 2 ? (month + 12) : month;
		int j = year / 100;
		int k = year % 100;

		int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

		String dayOfTheWeek = "";
		switch (h) {
			case 0:
				dayOfTheWeek = "Saturday";
				break;
			case 1:
				dayOfTheWeek = "Sunday";
				break;
			case 2:
				dayOfTheWeek = "Monday";
				break;
			case 3:
				dayOfTheWeek = "Tuesday";
				break;
			case 4:
				dayOfTheWeek = "Wednesday";
				break;
			case 5:
				dayOfTheWeek = "Thursday";
				break;
			case 6:
				dayOfTheWeek = "Friday";
				break;
			default:
				System.out.println("invalid input/Calculations");
				System.exit(1);
		}

		System.out.println("Day of the week " + dayOfTheWeek);
	}
}
