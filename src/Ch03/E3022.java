package Ch03;

import java.util.Scanner;

public class E3022 {
	public static void main(String[] args) {
		final int CIRCLE_RADIUS = 10;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point with 2 coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		double distanceFromCenter = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		String result = Math.abs(distanceFromCenter) < CIRCLE_RADIUS ? "in" : "not in";
		System.out.println("Point (" + x + " " + y + ") is " + result + " the circle");
	}
}