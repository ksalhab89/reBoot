package Ch03;

import java.util.Scanner;

public class E308 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 3 integers to sort in a non-decreasing order: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a <= b && b <= c)
			System.out.println(a + " " + b + " " + c);
		else if (a <= c && c <= b)
			System.out.println(a + " " + c + " " + b);
		else if (b <= a && a <= c)
			System.out.println(b + " " + a + " " + c);
		else if (b <= c)
			System.out.println(b + " " + c + " " + a);
		else if (a <= b)
			System.out.println(c + " " + a + " " + b);
		else System.out.println(c + " " + b + " " + a);
	}
}
