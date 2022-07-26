package ch03;

import java.util.Scanner;

public class E05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer for today’s day of the week" +
				                 "\n(Sunday is 0, Monday is 1, . . . , and Saturday is 6): ");
		int today = scanner.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDays = scanner.nextInt();

		String todayName = "";
		switch (today) {
			case 0:
				todayName = "Sunday";
				break;
			case 1:
				todayName = "Monday";
				break;
			case 2:
				todayName = "Tuesday";
				break;
			case 3:
				todayName = "Wednesday";
				break;
			case 4:
				todayName = "Thursday";
				break;
			case 5:
				todayName = "Friday";
				break;
			case 6:
				todayName = "Saturday";
				break;
			default:
				System.out.println("Incorrect today number");
		}

		String futureName = "";
		switch ((elapsedDays + today) % 7) {
			case 0:
				futureName = "Sunday";
				break;
			case 1:
				futureName = "Monday";
				break;
			case 2:
				futureName = "Tuesday";
				break;
			case 3:
				futureName = "Wednesday";
				break;
			case 4:
				futureName = "Thursday";
				break;
			case 5:
				futureName = "Friday";
				break;
			case 6:
				futureName = "Saturday";
				break;
			default:
				System.out.println("Incorrect today number");
		}

		System.out.printf("Today is %s and the future day is %s", todayName, futureName);
	}
}
