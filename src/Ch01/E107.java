package Ch01;

public class E107 {
	public static void main(String[] args) {
		System.out.println(4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
		System.out.println(4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
		System.out.println(4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13 -
				                        1.0 / 15 + 1.0 / 17 - 1.0 / 19 + 1.0 / 21 - 1.0 / 23 + 1.0 / 25 - 1.0 / 27 + 1.0 / 29));
	}
}
