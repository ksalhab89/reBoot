package Ch02;

import java.util.Scanner;

public class E2011 {
	public static void main(String[] args) {
		final double BIRTHS_IN_A_YEAR = 365 * 24 * 60 * 60 / 7.0;
		final double DEATHS_IN_A_YEAR = 365 * 24 * 60 * 60 / 13.0;
		final double IMMIGRANTS_IN_A_YEAR = 365 * 24 * 60 * 60 / 45.0;
		final int CURRENT_POPULATION = 312032486;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = scanner.nextInt();

		int population = (int) (CURRENT_POPULATION + 5 * (BIRTHS_IN_A_YEAR - DEATHS_IN_A_YEAR + IMMIGRANTS_IN_A_YEAR));
		System.out.println("The population in " + years + " is " + population);

	}
}
