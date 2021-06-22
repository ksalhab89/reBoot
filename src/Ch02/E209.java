package Ch02;

import java.util.Scanner;

public class E209 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter v0, v1, and t: ");
		double initialV = scanner.nextDouble();
		double finalV = scanner.nextDouble();
		double time = scanner.nextDouble();

		double acceleration = (finalV - initialV) / time;
		System.out.println("the average acceleration is " + acceleration);
	}
}
