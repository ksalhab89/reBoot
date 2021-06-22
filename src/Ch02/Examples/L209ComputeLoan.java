package Ch02.Examples;

import java.util.Scanner;

public class L209ComputeLoan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter annual interest rate (for e.g. 7.5%): ");
		double annualInterestRate = scanner.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.print("Enter Number of years as integer: ");
		int numberOfYears = scanner.nextInt();

		System.out.print("Enter Loan Amount: ");
		double loanAmount = scanner.nextDouble();

		double monthlyPayment = loanAmount * monthlyInterestRate /
				                        (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

		double totalPayment = monthlyPayment * 12 * numberOfYears;

		System.out.println("Monthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment: " + (int) (totalPayment * 100) / 100.0);
	}
}
