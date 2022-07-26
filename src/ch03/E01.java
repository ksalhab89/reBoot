package ch03;

import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double discriminant = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);

		if (discriminant > 0) {
			double root1 = (-b + discriminant) / (2 * a);
			double root2 = (-b - discriminant) / (2 * a);
			System.out.printf("The equation has two roots %f and %f", root1, root2);
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.printf("The equation has one root %f", root);
		} else System.out.println("The equation has no real roots");

	}
}
