// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int hundreds = num / 100;
		int tens = (num / 10) % 10;
		int ones = num % 10;
		System.out.printf("%d hundreds, %d tens, and %d ones.", hundreds, tens, ones);
	}
}
