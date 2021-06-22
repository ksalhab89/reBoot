package Ch02;

import java.util.Scanner;

public class E203 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = scanner.nextDouble();

		double meters = 0.305 * feet;
		System.out.println(feet + " feet is " + meters + " meters");
	}
}
