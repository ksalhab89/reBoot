package ch03;

import java.util.Scanner;

public class E06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double pounds = scanner.nextDouble();

		System.out.print("Enter height in inches: ");
		double inches = scanner.nextDouble();

		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;

		double bmi = kilograms / Math.pow(meters, 2);
		System.out.printf("BMI is %.3f %n", bmi);

		if (bmi < 16) {
			System.out.println("Severe Thinness");
		} else if (bmi <= 18.4) {
			System.out.println("Thin");
		} else if (bmi <= 24.9) {
			System.out.println("Normal");
		} else if (bmi <= 29.9) {
			System.out.println("Overweight");
		} else System.out.println("Obese");

	}
}
