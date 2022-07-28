package ch03;

import java.util.Scanner;

public class E12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int number = scanner.nextInt();

		if (number / 100 == number % 10) {
			System.out.printf("%d is a palindrome", number);
		} else System.out.printf("%d is not a palindrome", number);
	}
}
