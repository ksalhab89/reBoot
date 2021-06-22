package Ch02;

import java.util.Scanner;

public class E2010 {
	public static void main(String[] args) {
		final int SOME_CONSTANT = 4184;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double weightOfWater = scanner.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemperature = scanner.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemperature = scanner.nextDouble();

		double energy = weightOfWater * (finalTemperature - initialTemperature) * SOME_CONSTANT;
		System.out.println("The energy needed is " + energy);
	}
}
