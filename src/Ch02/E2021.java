package Ch02;

import java.util.Scanner;

public class E2021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investment = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterest = scanner.nextDouble();
		double monthlyInterest = annualInterest / 1200.0;

		System.out.print("Enter number of years: ");
		double years = scanner.nextDouble();

		double futureInvestmentValue = investment * Math.pow((1 + monthlyInterest), years * 12);
		System.out.println("Accumulated value is " + (int) (futureInvestmentValue * 100) / 100.0);
	}
}
