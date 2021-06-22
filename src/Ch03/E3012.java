package Ch03;

import java.util.Scanner;

public class E3012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a three-digit integer number: ");
		int number = scanner.nextInt();

		int firstDigit = number / 100;
		int lastDigit = number % 10;

		boolean palindrome = firstDigit == lastDigit;

		if (palindrome)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");
	}
}
