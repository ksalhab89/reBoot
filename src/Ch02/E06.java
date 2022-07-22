package Ch02;

import java.util.Scanner;

public class E06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number = scanner.nextInt();

		int onesDigit = number % 10;
		int tensDigit = ( number / 10 ) % 10;
		int hundredsDigit = number / 100;

		int sumOfDigits = onesDigit + tensDigit + hundredsDigit;
		System.out.printf("The sum of the digits is %d", sumOfDigits);

	}
}
