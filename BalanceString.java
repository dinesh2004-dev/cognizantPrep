package cognizantPrep;

//Minimum Conversions to an Alternating “XY” String
//Jacob has a string S consisting only of the characters X and Y. He defines a string as balanced if the characters strictly alternate: no two identical letters appear consecutively. For example, XYXYX… or YXYXY… are balanced, but XXY and YYX are not.
//
//You may convert any character in S from X to Y or from Y to X. You cannot insert or delete characters—only flip existing ones.
//
//Return the minimum number of conversions needed to make S balanced.
//
//Input Specification
//A single string S, length N (1 ≤ N ≤ 10<sup>5</sup>), consisting only of X and Y.
//
//Output Specification
//An integer: the minimum number of flips required so that S becomes an alternating sequence of X and Y.
//
//Example
//Example 1 Input:
//
//Code
//XXY
//Output:
//
//Code
//1
//Explanation:
//
//Option 1: Transform to XYX (pattern X Y X), flipping the second X→Y: 1 flip.
//
//Option 2: Transform to YXY (pattern Y X Y), flipping the first X→Y: 1 flip. Minimum flips = 1.
//
//Example 2 Input:
//
//Code
//XYXYX
//Output:
//
//Code
//0
//Explanation: Already alternates, so no flips needed.

public class BalanceString {
	public static int balanceString(String s) {
		
		int n = s.length();
		int diff1 = 0,diff2 = 0;
		
		for(int i = 0; i < n; i++) {
			char expected1 = (i % 2 == 0) ? 'X' : 'Y';
			char expected2 = (i % 2 == 0) ?  'Y' : 'X';
			
			if(s.charAt(i) != expected1) {
				diff1++;
			}
			if(s.charAt(i) != expected2) {
				diff2++;
			}
		}
		return Math.min(diff1, diff2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "XXYYXXY";
		
		System.out.println(balanceString(s));
	}

}
