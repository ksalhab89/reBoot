package Ch03;

import java.util.Scanner;

public class E3014 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your Guess, 0 for heads or 1 for tails: ");
		int guess = scanner.nextInt();

		int coin = (int) Math.floor(Math.random() * 2);

		String result = guess == coin ? "Correct" : "Incorrect";
		System.out.println("your guess is " + result);
	}
}
