package Ch02;

import java.util.Scanner;

public class E2012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double speed = scanner.nextDouble();
		double acceleration = scanner.nextDouble();

		double length = Math.pow(speed, 2) / (2 * acceleration);
		System.out.println("The minimum runway length for this airplane is " + ((int) (length * 1000)) / 1000.0);
	}
}
