package Ch03;

import java.util.Scanner;

public class E301 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double discriminant = Math.pow(b, 2) - 4 * a * c;

		if (discriminant > 0) {
			double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + x1 + " " + x2);
		} else if (discriminant == 0) {
			double x = (-b) / (2 * a);
			System.out.println("The equation has one root " + x);
		} else
			System.out.println("The equation has no real roots");
	}
}
