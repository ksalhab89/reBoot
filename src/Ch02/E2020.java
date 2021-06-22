package Ch02;

import java.util.Scanner;

public class E2020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g.m 3 for 3%): ");
		double balance = scanner.nextDouble();
		double annualInterest = scanner.nextDouble();

		double interest = balance * annualInterest / 1200;
		System.out.println("The interest is " + (int) (interest * 10000) / 10000.0);

	}
}
