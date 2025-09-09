package cognizantPrep;

import java.util.Arrays;

//Count Splits With Even Difference
//Problem Description
//You are given an integer array A of length N. A split at index i (where 0 ≤ i < N - 1) divides the array into two non-empty parts:
//
//Left part: A[0…i]
//
//Right part: A[i+1…N-1]
//
//A split is considered valid if the difference between the sum of the left part and the sum of the right part is even. Formally,
//
//Return the total number of valid splits in A.
//
//Example 1
//Code
//Input:  A = [1, 1, 1, 1]
//Output: 3
//Explanation:
//  i = 0: left = [1]      → sumL = 1, sumR = 3, |1 - 3| = 2 (even)
//  i = 1: left = [1, 1]   → sumL = 2, sumR = 2, |2 - 2| = 0 (even)
//  i = 2: left = [1, 1, 1]→ sumL = 3, sumR = 1, |3 - 1| = 2 (even)
//Total valid splits = 3.
//Example 2
//Code
//Input:  A = [2, 1, 3, 5]
//Output: 0
//Explanation:
//  All possible splits yield an odd difference.
//Constraints
//2 ≤ N = A.length ≤ 10^5
//
//-10^9 ≤ A[i] ≤ 10^9

public class CountSplitsWithEvenDifference {
	public static int countSplit(int[] arr) {
		
		int sum = Arrays.stream(arr).sum();
		
		int leftSum = 0;
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			leftSum += arr[i];
			int rightSum = sum - leftSum;
			
			if(Math.abs(leftSum - rightSum) % 2 == 0) {
				cnt++;
			}
		}
		
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,10,3,7,6};
		
		int res = countSplit(arr);
		
		System.out.println(res);
	}

}
