package cognizantPrep;

import java.util.Arrays;

//Maximum Product Pair With Sum Equal to 18
//Description
//You are given an integer array A of length N. You need to find a pair of elements (x, y) in A such that:
//
//x + y == 18
//
//x > y
//
//The product x * y is maximized among all valid pairs
//
//Return the pair as an array [x, y]. If no such pair exists, return an empty array.
//
//Function Signature
//cpp
//// C++
//vector<int> maxProductPairSum18(vector<int>& A);
//java
//// Java
//class Solution {
//    public int[] maxProductPairSum18(int[] A) { 
//        // implementation 
//    }
//}
//python
//# Python
//class Solution:
//    def maxProductPairSum18(self, A: List[int]) -> List[int]:
//        pass
//Example 1
//Input:
//
//Code
//N = 8  
//A = [11, 2, 8, 10, 5, 7, 1, 7]
//Output:
//
//Code
//[10, 8]
//Explanation:
//
//Valid pairs with sum 18 and first element > second element are:
//
//(11, 7) → product = 77
//
//(10, 8) → product = 80
//
//The maximum product is 80 for the pair (10, 8), so we return [10, 8].
//
//Constraints
//2 ≤ N ≤ 10^5
//
//1 ≤ A[i] ≤ 10^6
//
//Each element of A may appear multiple times.

public class MaximumProductPairWithSumEqualTo18 {
	
	public static int[] maxProductPairSum18(int[] arr) {
		
		int n = arr.length;
		int low = 0,high = n - 1;
		int maxProd = Integer.MIN_VALUE;
		int res[] = new int[2];
		
		Arrays.sort(arr);
		while(low < high) {
			
			int sum = arr[low] + arr[high];
			
			if(sum > 18) {
				high--;
			}
			else if(sum < 18) {
				low++;
			}
			else {
				
				int product = arr[low] * arr[high];
				if(product > maxProd) {
					res[0] = arr[high];
					res[1] = arr[low];
					
					maxProd = product;
				}
				low++;
				high--;
				
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {11, 2, 8, 10, 5, 7, 1, 7};
		
		int[] res = maxProductPairSum18(A);
		
		for(int ele : res) {
			System.out.print(ele+" ");
		}
	}

}
