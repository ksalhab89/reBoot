package ch02;

import java.util.Scanner;

public class E20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g.m 3 for 3% ): ");

		double balance = scanner.nextDouble();
		double annualInterestRate = scanner.nextDouble();

		double interest = balance * (annualInterestRate / 1200);
		System.out.printf("THe interest is %f", interest);
	}
}
