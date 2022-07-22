package Ch02;

import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a degree in Celsius: ");
		double celsius = scanner.nextDouble();

		double fahrenheit = (9 / 5.0) * celsius + 32;
		System.out.printf("%.1f Celsius is %.1f Fahrenheit.", celsius, fahrenheit);
	}
}
