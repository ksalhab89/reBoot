package Ch01;

public class E1012 {
	public static void main(String[] args) {
		System.out.println("runner runs 24 miles in 1H, 40M & 35s");
		System.out.println("hence his speed in miles/hour is: " + (24.0 / (1 + (((35 / 60.0) + 40) / 60))));
		System.out.println("and " + (24.0 / (1 + (((35 / 60.0) + 40) / 60))) * 1.6 + " km/hour");
	}
}
