package ch02;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter v0, v1, and t: ");
		double initialVelocity = scanner.nextDouble();
		double finalVelocity = scanner.nextDouble();
		double time = scanner.nextDouble();

		double acceleration = (finalVelocity - initialVelocity) / time;
		System.out.printf("The average acceleration is %.4f", acceleration);

	}
}
