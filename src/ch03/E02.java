package ch03;

import java.util.Scanner;

public class E02 {
	public static void main(String[] args) {

		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);

		Scanner scanner = new Scanner(System.in);
		System.out.printf("What is %d + %d + %d = ", number1, number2, number3);
		int answer = scanner.nextInt();
		int sum = number1 + number2 + number3;

		if (answer == sum) {
			System.out.println("Correct answer!");
		} else System.out.println("Incorrect answer.");

	}
}
