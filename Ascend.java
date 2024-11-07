// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		Random random = new Random();
		int lim = Integer.parseInt(args[0]);
		int a = random.nextInt(lim);
		int b = random.nextInt(lim);
		int c = random.nextInt(lim);
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int middle = a + b + c - min - max;
		System.out.printf("%d %d %d%n", a, b, c);
		System.out.printf("%d %d %d%n", min, middle, max);

	}
}
