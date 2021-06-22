package Ch02;

import java.util.Scanner;

public class E2016 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = scanner.nextDouble();

		double hexagonArea = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);
		System.out.println("The area os the hexagon is " + (int) (hexagonArea * 1000) / 1000.0);

	}
}
