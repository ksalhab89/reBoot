package ch03;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = scanner.nextInt();
		int d9 = isbn % 10;
		int d8 = (isbn / 10) % 10;
		int d7 = (isbn / 100) % 10;
		int d6 = (isbn / 1000) % 10;
		int d5 = (isbn / 10000) % 10;
		int d4 = (isbn / 100000) % 10;
		int d3 = (isbn / 1000000) % 10;
		int d2 = (isbn / 10000000) % 10;
		int d1 = (isbn / 100000000) % 10;

		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) {
			System.out.printf("%dX", isbn);
		} else System.out.printf("%d%d", isbn, d10);

	}
}
