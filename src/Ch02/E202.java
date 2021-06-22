package Ch02;

import java.util.Scanner;

public class E202 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;

		System.out.println("The area is " + (int) (area * 1e4) / 1.0e4);
		System.out.println("The volume is " + (int) (volume * 100) / 100.0);
	}
}
