package Ch02;

import java.util.Scanner;

public class E2014 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double poundWeight = scanner.nextDouble();

		System.out.print("Enter height in inches: ");
		double inchHeight = scanner.nextDouble();

		double weightKilograms = poundWeight * 0.454;
		double HeightMeters = inchHeight * 0.0254;

		double bmi = weightKilograms / Math.pow(HeightMeters, 2);
		System.out.println("BMI is " + (int) (bmi * 100) / 100.0);
	}
}
