package ch02;

import java.util.Scanner;

public class E16 {
	public static void main(String[] args) {
		final double HEXAGON_EFFICIENT = 3 * Math.pow(3, 0.5) / 2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of the side: ");
		double hexagonSide = scanner.nextDouble();

		double area = HEXAGON_EFFICIENT * Math.pow(hexagonSide, 2);
		System.out.printf("The area of the hexagon is %.4f", area);
	}
}
