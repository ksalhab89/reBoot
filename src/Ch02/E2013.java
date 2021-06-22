package Ch02;

import java.util.Scanner;

public class E2013 {
	public static void main(String[] args) {
		final double ANNUAL_INTEREST = 0.05;
		final double MONTHLY_INTEREST = ANNUAL_INTEREST / 12;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double deposit = scanner.nextDouble();

		double monthlyIncrease = 1 + MONTHLY_INTEREST;

		double account = deposit * monthlyIncrease;
		account = (deposit + account) * monthlyIncrease;
		account = (deposit + account) * monthlyIncrease;
		account = (deposit + account) * monthlyIncrease;
		account = (deposit + account) * monthlyIncrease;
		account = (deposit + account) * monthlyIncrease;

		System.out.println("After the Sixth Month, the account value is $" + (int) (account * 100) / 100.0);


	}
}
