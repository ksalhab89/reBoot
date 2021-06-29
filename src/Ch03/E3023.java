package Ch03;

import java.util.Scanner;

public class E3023 {
	public static void main(String[] args) {
		final int RECTANGLE_HEIGHT = 5;
		final int RECTANGLE_WIDTH = 10;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point with 2 coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		String result = Math.abs(x) <= RECTANGLE_WIDTH / 2.0 && Math.abs(y) <= RECTANGLE_HEIGHT / 2.0 ? "in" : "not in";
		System.out.println("Point (" + x + " " + y + ") is " + result + " the rectangle");
	}
}
