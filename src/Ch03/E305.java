package Ch03;

import java.util.Scanner;

public class E305 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter today's day ");
		int today = scanner.nextInt();

		System.out.print("Enter number of days elapsed since today: ");
		int elapsedDays = scanner.nextInt();

		String day;
		switch (today) {
			case 0:
				day = "Sunday";
				break;
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + today);
		}

		int next = (today + elapsedDays) % 7;
		String nextDay;

		switch (next) {
			case 0:
				nextDay = "Sunday";
				break;
			case 1:
				nextDay = "Monday";
				break;
			case 2:
				nextDay = "Tuesday";
				break;
			case 3:
				nextDay = "Wednesday";
				break;
			case 4:
				nextDay = "Thursday";
				break;
			case 5:
				nextDay = "Friday";
				break;
			case 6:
				nextDay = "Saturday";
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + today);
		}
		System.out.print("Today is " + day + " and the future day is " + nextDay);
	}
}
