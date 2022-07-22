package Ch02;

import java.util.Scanner;

public class E07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		int minutes = scanner.nextInt();

		int numberOfYears = minutes / 60 / 24 / 365;
		int numberOfRemainingDays = (minutes / 60 / 24) - numberOfYears * 365;

		System.out.printf("%d minutes is approximately %d years and %d days",
				minutes, numberOfYears, numberOfRemainingDays);

	}
}
