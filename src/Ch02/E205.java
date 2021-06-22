package Ch02;

import java.util.Scanner;

public class E205 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = scanner.nextDouble();
		double tip = scanner.nextDouble();

		double gratuity = subtotal * tip / 100;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}
}
