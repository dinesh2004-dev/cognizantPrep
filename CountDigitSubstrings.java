package cognizantPrep;

//Counting Letter-Bound Numeric Substrings
//Given a string S of length N consisting of lowercase letters ('a'–'z') and digits ('0'–'9'), a digit substring is defined as a maximal sequence of one or more consecutive digits.
//
//Your task is to count how many digit substrings in S are immediately preceded and followed by a lowercase letter.
//
//Input Specification
//A single string S of length N (1 ≤ N ≤ 10⁵), containing only lowercase letters and digits.
//
//Output Specification
//An integer representing the total number of digit substrings in S that have a letter immediately before and after them.
//
//Examples
//Example	S	Output	Explanation
//1	a123d	1	“123” is preceded by ‘a’ and followed by ‘d’.
//2	1a23b4	1	Only “23” has letters on both sides.
//3	ab12cd34ef56gh	3	Substrings “12”, “34”, “56” each sit between two letters.
//4	abc123	0	“123” has no trailing letter.
//5	123abc456	0	Neither “123” nor “456” is surrounded on both sides.
//Constraints
//1 ≤ |S| ≤ 10⁵
//
//S contains only characters in ['a'..'z','0'..'9']

public class CountDigitSubstrings {
	
	public static int countDigitSubstrings(String s) {
		
		int n = s.length();
		
		int cnt = 0;
		int i = 0;
		while(i < n) {
			
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				int start = i;
				
				while(i < n && Character.isDigit(s.charAt(i))) {
					i++;
				}
				int end = i - 1;
				
				if(start > 0 && end < n - 1 && Character.isLetter(s.charAt(start - 1))
						&& Character.isLetter(s.charAt( end + 1))) {
					cnt++;
				}
			}
			else {
				i++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "a123d"; 
		 System.out.println(countDigitSubstrings(s));

	}

}
