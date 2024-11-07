// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int initialSum = Integer.parseInt(args[0]);
		double presentage = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = initialSum * Math.pow((presentage/100) + 1, years);
		System.out.printf("After %d years, a $%d saved at %.1f%% will yield $%d%n", years, initialSum, presentage, (int)futureValue);
	}
}