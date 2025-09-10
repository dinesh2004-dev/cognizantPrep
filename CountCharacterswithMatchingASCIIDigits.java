package cognizantPrep;

import java.util.HashSet;
import java.util.Set;

//Count Characters with Matching ASCII Digits
//Problem Description
//You are given an integer array A of size N, where each element is a digit in the range [0, 9], and a string S consisting of uppercase English letters. For each character c in S, let ascii(c) be its ASCII value and let digits(ascii(c)) be the multiset of digits in that value. A character c “matches” if at least one digit from digits(ascii(c)) appears in array A. Return the total number of matching characters in S.
//
//Function Signature
//python
//def countMatchingChars(A: List[int], S: str) -> int:
//Example 1
//Input
//
//Code
//A = [1, 6, 4, 3, 6, 5]
//S = "ABCDEF"
//Output
//
//Code
//5
//Explanation
//
//A → ASCII 65 → digits = [6, 5] → both 6 and 5 are in A → match
//
//B → ASCII 66 → digits = [6, 6] → 6 is in A → match
//
//C → ASCII 67 → digits = [6, 7] → 6 is in A → match
//
//D → ASCII 68 → digits = [6, 8] → 6 is in A → match
//
//E → ASCII 69 → digits = [6, 9] → 6 is in A → match
//
//F → ASCII 70 → digits = [7, 0] → neither 7 nor 0 is in A → no match
//
//Total matching characters = 5
//
//Constraints
//1 <= N <= 10^4
//
//1 <= S.length <= 10^4
//
//0 <= A[i] <= 9 for all 0 <= i < N
//
//S consists only of uppercase English letters ('A' to 'Z')

public class CountCharacterswithMatchingASCIIDigits {
	
	public static int charactersWithMatchingASCIIDigits(int[] A,String S) {
		
		Set<Integer> st = new HashSet<>();
		
		for(int ele : A) {
			
			st.add(ele);
		}
		
		int cnt = 0;
		
		for(char ch : S.toCharArray()) {
			
			int ascii = ch;
			int firstDigit = (ascii / 10) % 10;
			int lastDigit = ascii % 10;
//			System.out.println(ascii);
			
			if(st.contains(firstDigit) || st.contains(lastDigit)) {
				
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 6, 4, 3, 6, 5};
		String S = "ABCDEF";
		
		System.out.println(charactersWithMatchingASCIIDigits(A,S));
	}

}
