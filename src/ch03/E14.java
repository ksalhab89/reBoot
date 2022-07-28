package ch03;

import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 0 or 1 for guess whether it's tails or heads: ");
		int guess = scanner.nextInt();

		int spin = (int) (Math.random() * 2);

		boolean answer = spin == guess;
		System.out.printf("Guess is %b%n", answer);
		System.out.printf("Spin: %d, Guess: %d", spin, guess);
	}
}
