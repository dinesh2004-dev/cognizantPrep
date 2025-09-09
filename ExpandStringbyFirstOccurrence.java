package cognizantPrep;

import java.util.Arrays;

//Expand String by First Occurrence
//Description
//You are given a string S consisting of lowercase English letters. Construct and return an expanded version of S as follows:
//
//For each character c in S, determine the 1-based index k of its first occurrence in S.
//
//Repeat c exactly k times.
//
//Join all repeated groups with hyphens ('-').
//
//Return the resulting hyphen-separated string.
//
//Example 1
//Code
//Input: S = "abcaba"
//Output: "a-bb-ccc-a-bb-a"
//Explanation:
//  - 'a' first appears at index 1 → "a"
//  - 'b' first appears at index 2 → "bb"
//  - 'c' first appears at index 3 → "ccc"
//  - Next 'a' → index 1 → "a"
//  - Next 'b' → index 2 → "bb"
//  - Next 'a' → index 1 → "a"
//Concatenated with hyphens: "a-bb-ccc-a-bb-a"
//Example 2
//Code
//Input: S = "zzxyzzz"
//Output: "zz-zz-xxx-y-zzzz-zzzz-zzzz"
//Explanation:
//  - First 'z' at index 1 → "z"
//  - Second 'z' still index 1 → "z"
//    → group "zz"
//  - 'x' at index 3 → "xxx"
//  - 'y' at index 4 → "yyyy"
//  - Remaining 'z's each use k=1 → "z" repeated once each
//    → four more "z" groups of length 1
//  Final: "zz-xxx-yyyy-z-z-z-z"
//Constraints
//1 <= S.length <= 10^5
//
//S consists only of lowercase English letters.

public class ExpandStringbyFirstOccurrence {
	public static String expand(char ch,int n) {
		
		char[] arr = new char[n];
		Arrays.fill(arr,ch);
		return new String(arr);
	}
	public static String expandString(String s) {
		
		int n = s.length();
		int[] hash = new int[26];
		
		Arrays.fill(hash,-1);
		
		for(int i = 0; i < n; i++) {
			
			char ch = s.charAt(i);
			if(hash[ch - 'a'] == -1) {
				hash[ch - 'a'] = i + 1; 
			}
		}
		
		
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < n - 1; i++) {
			
			char ch = s.charAt(i);
			
			String str = expand(ch,hash[ch - 'a']);
			
			str = str + "-";
			
			res.append(str);
		}
		
		char ch = s.charAt(s.length() - 1);
		
		String str = expand(ch,hash[ch - 'a']);
		
		res.append(str);
		
		return res.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "abcaba";
		
		String res = expandString(S);
		
		System.out.println(res);
	}

}
