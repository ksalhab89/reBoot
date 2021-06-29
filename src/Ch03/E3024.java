package Ch03;

import java.util.Scanner;

public class E3024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number (from 1 - 52) to pick a card: ");
		int userInput = scanner.nextInt();

		if (userInput < 1 || userInput > 52) {
			System.out.println("Incorrect Input, Exiting !");
			System.exit(1);
		}
		String cardType;
		if (userInput > 39) {
			cardType = "Hearts";
			userInput -= 39;
		} else if (userInput > 26) {
			cardType = "Clubs";
			userInput -= 26;
		} else if (userInput > 13) {
			cardType = "Diamonds";
			userInput -= 13;
		} else {
			cardType = "Spades";
		}
		String card = "";
		switch (userInput) {
			case 1:
				card = "Ace";
				break;
			case 2:
				card = "2";
				break;
			case 3:
				card = "3";
				break;
			case 4:
				card = "4";
				break;
			case 5:
				card = "5";
				break;
			case 6:
				card = "6";
				break;
			case 7:
				card = "7";
				break;
			case 8:
				card = "8";
				break;
			case 9:
				card = "9";
				break;
			case 10:
				card = "10";
				break;
			case 11:
				card = "Jack";
				break;
			case 12:
				card = "Queen";
				break;
			case 13:
				card = "King";
				break;
			default:
				System.out.println("Error in input and/or Calculations");
				System.exit(1);
				break;
		}
		System.out.println("The card you picked is " + card + " of " + cardType);
	}
}
