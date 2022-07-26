package ch03;

import java.util.Scanner;

public class E08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Integer No.1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Integer No.2: ");
		int number2 = scanner.nextInt();

		System.out.print("Enter Integer No.3: ");
		int number3 = scanner.nextInt();


		if (number1 <= number2 && number1 <= number3) {
			if (number2 <= number3) {
				System.out.printf("%d %d %d", number1, number2, number3);
			} else System.out.printf("%d %d %d", number1, number3, number2);
		} else if (number2 <= number1 && number2 <= number3) {
			if (number1 <= number3) {
				System.out.printf("%d %d %d", number2, number1, number3);
			} else System.out.printf("%d %d %d", number2, number3, number1);
		} else {
			if (number2 <= number1) {
				System.out.printf("%d %d %d", number3, number2, number1);
			} else System.out.printf("%d %d %d", number3, number1, number2);
		}

	}
}
