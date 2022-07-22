package Ch02;

import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int numberOfYears = scanner.nextInt();

		int currentPopulation = 312032486;

		// Find seconds in years
		double secondsInYears = 60 * 60 * 24 * 365;

		// Convert birth per second to birth per year
		double birthPerYear = secondsInYears / 7.0;

		// Convert death per second to death per year
		double deathPerYear = secondsInYears / 13.0;

		// Convert new immigrant per second to new immigrant per year
		double immigrantPerYear = secondsInYears / 45.0;

		double totalProjectionPerYear = birthPerYear + immigrantPerYear - deathPerYear;

		int projectedPopulation = (int) (currentPopulation + (numberOfYears * totalProjectionPerYear));

		System.out.printf("The population in %d years is %d", numberOfYears, projectedPopulation);
	}
}
