package Ch02;

import java.util.Scanner;

public class E2019 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three point for a triangle (x1 y1 x2 y2 x3 y3): ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();

		double side12 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side13 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		double side23 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

		double s = (side12 + side13 + side23) / 2;
		double area = Math.pow(s * (s - side12) * (s - side13) * (s - side23), 0.5);

		System.out.println("The are of te triangle is " + (int) (area * 100) / 100.0);
	}

}
