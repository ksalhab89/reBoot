package Ch02;

import java.util.Scanner;

public class E207 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long minutes = scanner.nextLong();

		long hours = minutes / 60;
		long tempDays = hours / 24;
		long years = tempDays / 365;
		long days = tempDays % 365;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

	}
}
