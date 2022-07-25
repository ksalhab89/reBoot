package ch02;

import java.util.Scanner;

public class E17 {
	public static void main(String[] args) {
		final double CONSTANT = 35.74;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double outsideTemperature = scanner.nextDouble();

		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = scanner.nextDouble();

		double temperature = CONSTANT + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);
		System.out.printf("The wind chill index is %5f", temperature);
	}
}
