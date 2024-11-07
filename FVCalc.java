// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int initialSum = Integer.parseInt(args[0]);
		int presentage = Integer.parseInt(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = initialSum * Math.pow(((double)presentage/100) + 1, years);
		System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d%n", years, initialSum, (double)presentage, (int)futureValue);
	}
}