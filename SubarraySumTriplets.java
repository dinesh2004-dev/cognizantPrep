package cognizantPrep;

//Subarray Sum Triplets
//Description
//Given an integer array nums, return the number of subarrays of size 3 such that the sum of the first and third elements is equal to the second element. A subarray is a contiguous sequence of elements in the array.
//
//Example 1
//Input:
//
//Code
//nums = [1, 2, 1, 3, 5, 2, 4, 2]
//Output:
//
//Code
//3
//Explanation: The subarrays of size 3 that satisfy nums[i] + nums[i+2] == nums[i+1] are
//
//Code
//[1, 2, 1], [3, 5, 2], [2, 4, 2]
//Constraints
//3 ≤ nums.length ≤ 10^5
//
//–10^5 ≤ nums[i] ≤ 10^5

public class SubarraySumTriplets {
	public static int countTriplets(int[] arr) {
		int n = arr.length;
		
		int cnt = 0;
		for(int i = 0; i <= n - 3; i++) {
			
			if(arr[i] + arr[i + 2] == arr[i + 1]) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,3,5,2,4,2};
		
		int res = countTriplets(arr);
		
		System.out.println(res);
	}

}
