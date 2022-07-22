package Ch02;

import java.util.Scanner;

public class E02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = scanner.nextDouble();
		double length = scanner.nextDouble();

		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;

		System.out.printf("The are is %.4f %n", area);
		System.out.printf("The volume is %.1f", volume);
	}
}
