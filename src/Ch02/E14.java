package Ch02;

import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double pounds = scanner.nextDouble();

		System.out.print("Enter height in inches: ");
		double inches = scanner.nextDouble();

		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;

		double bmi = kilograms / Math.pow(meters, 2);
		System.out.printf("BMI is %.4f", bmi);
	}
}
