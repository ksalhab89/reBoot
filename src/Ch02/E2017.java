package Ch02;

import java.util.Scanner;

public class E2017 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double outsideTemperature = scanner.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = scanner.nextDouble();

		double windChill = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + (int) (windChill * 100000) / 100000.0);

	}
}
