package cognizantPrep;

//Optimum Time to Drive Nails
//Problem Description
//Tom has a robot that helps him drive 
//𝑁
// nails into wooden planks. Nail 
//𝑖
// has length 
//𝑆
//𝑖
// inches. The robot can operate in two modes:
//
//Single Mode The robot focuses on one nail at a time. In each minute, it delivers 
//𝑋
// beats to the current nail (driving it 
//𝑋
// inches deeper). Once that nail is fully driven in, it moves to the next.
//
//Dynamic Mode The robot strikes all remaining nails simultaneously. In each minute, it delivers exactly one beat to each nail (driving each nail 1 inch deeper).
//
//Return the minimum number of minutes required to fully drive all nails into the planks.
//
//Function Signature
//python
//class Solution:
//    def minimumTime(self, N: int, X: int, S: List[int]) -> int:
//Example 1
//Code
//Input:
//    N = 5
//    X = 4
//    S = [2, 2, 4, 1, 1]
//Output: 4
//
//Explanation:
// Single Mode:
//   - Nail 1: ceil(2/4) = 1 min
//   - Nail 2: ceil(2/4) = 1 min
//   - Nail 3: ceil(4/4) = 1 min
//   - Nail 4: ceil(1/4) = 1 min
//   - Nail 5: ceil(1/4) = 1 min
//   Total = 5 minutes
//
// Dynamic Mode:
//   We need as many minutes as the tallest nail, since each minute drives every nail 1 inch:
//   max(S) = 4 minutes
//
// Minimum time = min(5, 4) = 4

 
public class OptimumTimeToDrill {
	
	public static int optimumTime(int n,int x,int[] s) {
		
		int singleMode = 0;
		int dynamicMode = 0;
		
		for(int i = 0; i < n; i++) {
			
			singleMode += (s[i] + x - 1) / x;
			dynamicMode = Math.max(dynamicMode, s[i]);
		}
		return Math.min(dynamicMode, singleMode);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int x = 4;
		int[] s = {2, 2, 4, 1, 1};
		
		System.out.println(optimumTime(n,x,s));
	}

}
