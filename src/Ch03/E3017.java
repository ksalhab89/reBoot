package Ch03;

import java.util.Scanner;

public class E3017 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = scanner.nextInt();

		int computer = (int) Math.floor(Math.random() * 3);

		switch (user) {
			case 0:
				switch (computer) {
					case 0:
						System.out.println("The computer is scissor. You are scissor. It is a draw");
						break;
					case 1:
						System.out.println("The computer is rock. You are scissor. you lost");
						break;
					case 2:
						System.out.println("The computer is paper. You are scissor. you won");
						break;
				}
				break;
			case 1:
				switch (computer) {
					case 0:
						System.out.println("The computer is scissor. You are rock. you won");
						break;
					case 1:
						System.out.println("The computer is rock. You are rock. It is a draw");
						break;
					case 2:
						System.out.println("The computer is paper. You are rock. yo lost");
						break;
				}
				break;
			case 2:
				switch (computer) {
					case 0:
						System.out.println("The computer is scissor. You are paper. you lost");
						break;
					case 1:
						System.out.println("The computer is rock. You are paper. you won");
						break;
					case 2:
						System.out.println("The computer is paper. You are paper. It is a draw");
						break;
				}
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + user);
		}
	}
}
