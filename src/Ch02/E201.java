package Ch02;

import java.util.Scanner;

public class E201 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		int celsius = scanner.nextInt();

		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");


	}
}
