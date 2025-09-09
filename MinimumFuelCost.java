package cognizantPrep;

public class MinimumFuelCost {

	public static void main(String[] args) {
		int N = 240;
		int p = 50;
		int q = 8;
		
		int costForBus = 50 * 75;
		int costForShuttle = 8 * 75;
		int busesFull = N / 80;
		int rem       = N % 80;

		
		int mixCost = busesFull * costForBus
		            + ((rem +  8 - 1) / 8) * costForShuttle;

		
		int busOnly  = (busesFull + 1) * costForBus;

		
		System.out.println(Math.min(mixCost, busOnly));
	}

}
