package cognizantPrep;

//669. Square Replacement in String
//Problem Description
//You are given a lowercase English string s. Transform the string by examining each character and applying the following rules based on its position in the alphabet:
//
//Let pos be the 1-indexed alphabetical position of the character (i.e., 'a' → 1, 'b' → 2, …, 'z' → 26).
//
//If pos is a perfect square, let k = √pos:
//
//If either immediate neighbor (the previous or next character in the string) exists and has alphabetical position k, do not change the character.
//
//Otherwise, replace the character with the letter whose alphabetical position is k (i.e., the k-th letter).
//
//If pos is not a perfect square, leave the character unchanged.
//
//Return the final string after all possible replacements.
//
//Function Signature
//python
//class Solution:
//    def replaceSquares(self, s: str) -> str:
//Examples
//Example 1:
//
//Code
//Input:  s = "abcd"
//Output: "abcb"
//Explanation:
//- 'a' → pos = 1 (perfect square), k = 1. Neighbor check trivial since k = 1; no change.
//- 'b' → pos = 2 (not square); no change.
//- 'c' → pos = 3 (not square); no change.
//- 'd' → pos = 4 (perfect square), k = 2. Neighbors are 'c'(3) and none at right; neither equals 2, so replace 'd' with 'b'.
//Example 2:
//
//Code
//Input:  s = "a"
//Output: "a"
//Explanation:
//- 'a' → pos = 1 (perfect square), k = 1; no neighbor has pos = 1, but by rule we still leave it unchanged.
//Example 3:
//
//Code
//Input:  s = "xbxd"
//Output: "xbxb"
//Explanation:
//- 'x' → pos = 24 (not square); no change.
//- 'b' → pos = 2 (not square); no change.
//- 'x' → pos = 24 (not square); no change.
//- 'd' → pos = 4 (perfect square), k = 2. Left neighbor 'x'(24) ≠ 2 and no right neighbor, so 'd' → 'b'.
//Constraints
//1 <= s.length <= 10^5

//s consists only of lowercase English letters ('a' to 'z').

public class SquareReplacementInString {
	public static String replaceString(String s) {
		
		int n = s.length();
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			
			int ch = s.charAt(i) - 'a' + 1;
			if(ch == 1 || ch == 4 || ch == 9 || ch == 16 || ch == 25) {
				
				int k = (int) Math.sqrt(ch);
				
				boolean left = (i > 0) && Math.sqrt((s.charAt(i - 1) - 'a' + 1)) == k ? true : false;
				boolean right = (i < n - 1) && Math.sqrt((s.charAt(i + 1) - 'a' + 1)) == k ? true : false;
				
				if(left || right) {
//					res.append((char)k);
					res.append(s.charAt(i));
				}
				else {
					res.append((char)('a'+ k - 1));
				}
			}
			else {
				res.append(s.charAt(i));
			}
		}
		return res.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xbxd";
		String res = replaceString(s);
		
		System.out.println(res);
	}

}
