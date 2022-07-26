package ch03;

import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {

		int number1 = 1 + (int) (Math.random() * 99);
		int number2 = 1 + (int) (Math.random() * 99);
		int sum = number1 + number2;

		Scanner scanner = new Scanner(System.in);
		System.out.printf("%d + %d = ", number1, number2);
		int answer = scanner.nextInt();

		if (sum == answer) {
			System.out.println("Correct answer!");
		} else System.out.println("Incorrect answer!");

	}
}
