package cognizantPrep;

import java.util.Stack;

//Sum of Pulse Skip Counts
//Given an integer array A of length N representing the pulse strengths of incoming data packets, process the sequence with a stack to compute a pulse skip count for each element:
//
//Initialize an empty stack.
//
//For each A[i] (0-indexed):
//
//Pop elements from the stack while it’s not empty and the top of the stack is ≤ A[i].
//
//Let skip_i be the number of elements popped in step 1.
//
//Push A[i] onto the stack.
//
//The total pulse skip count is the sum of all skip_i.
//
//Return the total pulse skip count after processing all packets.
//
//Function Signature
//python
//class Solution:
//    def totalSkipCount(self, A: List[int]) -> int:
//Example 1
//Input:
//
//Code
//A = [3, 1, 4, 2, 5, 1]
//Output:
//
//Code
//4
//Explanation:
//
//Process 3: stack [] → push → skip = 0
//
//Process 1: stack [3] → push → skip = 0
//
//Process 4: stack [3,1] → pop 1, pop 3 → skip = 2 → push 4
//
//Process 2: stack [4] → push → skip = 0
//
//Process 5: stack [4,2] → pop 2, pop 4 → skip = 2 → push 5
//
//Process 1: stack [5] → push → skip = 0
//
//Sum of skips = 2 + 2 = 4
//
//Constraints
//1 <= N == len(A) <= 10^5
//
//0 <= A[i] <= 10^9

public class SumofPulseSkipCounts {
	
	public static int countPulses(int[] arr) {
		
		int n = arr.length;
		
		Stack<Integer> st = new Stack<>();
		
		int totalCount = 0;
		
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			while(!st.isEmpty() && arr[i] >= st.peek()) {
				st.pop();
				cnt++;
			}
			
			totalCount += cnt;
			st.add(arr[i]);
		}
		return totalCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 4, 2, 5, 1};
		
		System.out.println(countPulses(arr));

	}

}
