package cognizantPrep;

//Replace Consecutive Characters with ‘#’
//Given a string S, apply the following two transformations in sequence and return the resulting string:
//
//Collapse repeated characters: Every maximal group of two or more identical consecutive characters in S is replaced by a single #.
//
//Merge hashes: After step 1, if two or more # characters appear consecutively, merge them into a single #.
//
//Input Specification
//A single string S
//
//1 ≤ |S| ≤ 10⁵
//
//S contains only lowercase English letters (a–z)
//
//Output Specification
//A single string after applying the two transformations
//
//Example
//Input
//
//Code
//aabbbccdeeea
//Output
//
//Code
//#d#a
//Explanation
//
//Collapse each group of repeated letters to #:
//
//Code
//aa   → #
//bbb  → #
//cc   → #
//d    → d
//eee  → #
//a    → a
//
//Result after step 1: "###d#a"
//Merge consecutive # characters:
//
//Code
//"###d#a" → "#d#a"

public class ReplaceConsecutiveCharacters {
	
	public static String replace(String s) {
		
		int n = s.length();
		
		int i = 0;
		
		StringBuilder str = new StringBuilder();
		
		 while (i < n) { 
	            int j = i; 
	            while (j < n && s.charAt(j) == s.charAt(i)) j++; 
	            if (j - i >= 2) { 
	                if (str.length() == 0  || str.charAt(str.length() - 1) != '#') str.append('#'); 
	            } else { 
	                str.append(s.charAt(i)); 
	            } 
	            i = j; 
	        } 
		return str.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbbccdeeea";
		System.out.println(replace(s));
	}

}
