package Ch02;

import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(" Enter a value for feet: ");
		double feet = scanner.nextDouble();

		double meters = 0.305 * feet;
		System.out.printf("%.1f feet is %.4f meters", feet, meters);
	}
}
