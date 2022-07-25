package ch02;

import java.util.Scanner;

public class E21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = scanner.nextDouble() / 100;

		System.out.print("Enter number of years: ");
		double numberOfYears = scanner.nextDouble();

		double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 12)), numberOfYears * 12);

		System.out.printf("Future value is %.2f", futureInvestmentValue);

	}
}
