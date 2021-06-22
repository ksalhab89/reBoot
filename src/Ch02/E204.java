package Ch02;

import java.util.Scanner;

public class E204 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = scanner.nextDouble();
		double kilograms = pounds * 0.454;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
