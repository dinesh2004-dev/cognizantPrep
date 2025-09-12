package cognizantPrep;

//Description
//Let StarSum(M) be the sum of all unique prime factors of M. Given an integer N, count how many integers M in the range 1 ≤ M ≤ N satisfy
//
//Code
//StarSum(M) > N
//Return that count.
//
//Example 1
//Input
//
//Code
//N = 1
//Output
//
//Code
//0
//Explanation
//
//The only candidate is M = 1.
//
//StarSum(1) = 0 (1 has no prime factors), and 0 is not > 1.
//
//Hence the answer is 0.
//
//Constraints
//1 ≤ N ≤ 10^6
//
//Time limit per test: 1 second
//
//Memory limit per test: 256 MB

public class CountOfStarSumProducts {
	public static int starSum(int m) {
		String num = String.valueOf(m);
		int sum = 0;
		
		for(int i = 0;i < num.length(); i++) {
			
			sum += Integer.parseInt(num.substring(0,i + 1));
		}
		return sum;
	}
	public static int countStarProduct(int n) {
		
		int cnt = 0;
		for(int m = 1; m <= n; m++) {
			
			if(starSum(m) >= n) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 100;
		System.out.println(countStarProduct(N));
	}

}
