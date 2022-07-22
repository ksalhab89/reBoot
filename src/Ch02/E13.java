package Ch02;

import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double monthlySavingAmount = scanner.nextDouble();

		double yearlyInterestRate = 0.05;
		double monthlyInterestRate = yearlyInterestRate / 12;

		double compoundedAmount = monthlySavingAmount * (1 + monthlyInterestRate);
		compoundedAmount = ( compoundedAmount + monthlySavingAmount) * ( 1 + monthlyInterestRate);
		compoundedAmount = ( compoundedAmount + monthlySavingAmount) * ( 1 + monthlyInterestRate);
		compoundedAmount = ( compoundedAmount + monthlySavingAmount) * ( 1 + monthlyInterestRate);
		compoundedAmount = ( compoundedAmount + monthlySavingAmount) * ( 1 + monthlyInterestRate);
		compoundedAmount = ( compoundedAmount + monthlySavingAmount) * ( 1 + monthlyInterestRate);

		System.out.printf("After the sixth month, the accound value is $%.2f", compoundedAmount);

	}
}
