package ch02;

import java.util.Scanner;

public class E05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = scanner.nextDouble();
		double gratuityPercentage = scanner.nextDouble();

		double gratuity = subtotal * gratuityPercentage / 100;
		double total = subtotal + gratuity;

		System.out.printf("The gratuity is $%.1f and total is $%.1f", gratuity, total);
	}
}
