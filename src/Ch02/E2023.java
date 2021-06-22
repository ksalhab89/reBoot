package Ch02;

import java.util.Scanner;

public class E2023 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = scanner.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = scanner.nextDouble();

		System.out.print("Enter price per gallon: ");
		double pricePerGallon = scanner.nextDouble();

		double cost = distance / milesPerGallon * pricePerGallon;
		System.out.println("The cost of driving is $" + (int) (cost * 100) / 100.0);

	}
}
