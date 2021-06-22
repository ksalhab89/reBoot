package Ch03;

public class E3016 {
	public static void main(String[] args) {
		final int X_MIN = -50;
		final int X_MAX = 50;
		final int Y_MIN = -100;
		final int Y_MAX = 100;

		int x = (int) Math.floor(Math.random() * (X_MAX - X_MIN + 1) + X_MIN);
		int y = (int) Math.floor(Math.random() * (Y_MAX - Y_MIN + 1) + Y_MIN);

		System.out.println("(" + x + "," + y + ")");

	}
}
