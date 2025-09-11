package cognizantPrep;

//Digit Reduction of Ancient Scroll Number
//Description
//An archaeologist discovers an ancient scroll bearing a single integer N. To unlock the scroll’s secret, you must reduce N to a single digit by repeatedly summing its decimal digits.
//
//On each step, replace the current number with the sum of its digits.
//
//Stop when the result is in the range 0–9.
//
//Write a function that, given N, returns the final single-digit result.
//
//Function Signature
//java
//int reduceToSingleDigit(int N)
//Examples
//Example 1: Input:
//
//Code
//N = 38
//Output:
//
//Code
//2
//Explanation: 3 + 8 = 11 → 1 + 1 = 2
//
//Example 2: Input:
//
//Code
//N = 41
//Output:
//
//Code
//5
//Explanation: 4 + 1 = 5
//
//Constraints
//0 ≤ N ≤ 2³¹ − 1

public class DigitReductionOfAncientScrollNumber {
	
	public static int reduceToSingleDigit(int n) {
		
		
		while(n >= 10) {
			int sum = 0;
			while(n > 0) {
				sum += n % 10;
				n = n / 10;
			}
			n = sum;
		}
		return n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 999;
		System.out.println(reduceToSingleDigit(n));

	}

}
