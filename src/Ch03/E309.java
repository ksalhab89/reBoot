package Ch03;

import java.util.Scanner;

public class E309 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();
		int d4 = scanner.nextInt();
		int d5 = scanner.nextInt();
		int d6 = scanner.nextInt();
		int d7 = scanner.nextInt();
		int d8 = scanner.nextInt();
		int d9 = scanner.nextInt();
		String number = String.valueOf(d1) + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;

		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 != 10)
			System.out.println("The ISBN-10 number is " + number + d10);
		else System.out.println("The ISBN-10 number is " + number + "X");
	}
}
