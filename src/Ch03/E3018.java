package Ch03;

import java.util.Scanner;

public class E3018 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		double weight = scanner.nextDouble();

		double shippingCost = 0;
		if (weight <= 0) {
			System.out.println("incorrect weight");
			System.exit(1);
		} else if (weight <= 1) {
			shippingCost = 3.5;
		} else if (weight <= 3) {
			shippingCost = 5.5;
		} else if (weight <= 10) {
			shippingCost = 8.5;
		} else if (weight <= 20) {
			shippingCost = 10.5;
		} else {
			System.out.println("the package cannot be shipped");
			System.exit(1);
		}

		System.out.println("The shipping cost of a package of " + weight + " is " + shippingCost);

	}
}
