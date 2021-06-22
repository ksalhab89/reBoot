package Ch02;

import java.util.Scanner;

public class E206 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = scanner.nextInt();

		int ones = number % 10;
		int tens = (number / 10) % 10;
		int hundreds = number / 100;

		int sum = ones + tens + hundreds;

		System.out.println("sum of digits is " + sum);
	}
}
