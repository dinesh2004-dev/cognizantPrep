package cognizantPrep;

//Longest Harmonic Substring
//Problem Description
//We define a harmonic pattern as a concatenation of segments 
//𝑝
//1
//,
//𝑝
//2
//,
//…
//,
//𝑝
//𝑚
//, where each segment 
//𝑝
//𝑘
// is the first 
//𝑘
//+
//1
// letters of the English alphabet:
//
//𝑝
//1
//=
//"ab"
//
//𝑝
//2
//=
//"abc"
//
//𝑝
//3
//=
//"abcd"
//
//…
//
//A string is harmonic if it can be written exactly as
//
//𝑝
//1
//+
//𝑝
//2
//+
//⋯
//+
//𝑝
//𝑚
//for some integer 
//𝑚
//≥
//1
//.
//
//Given a lowercase string s, return the length of the longest contiguous substring of s that forms a harmonic pattern.
//
//Example 1
//Input:
//
//Code
//s = "ababcabc"
//Output:
//
//Code
//5
//Explanation: The substring "ababc" (indices 0–4) equals
//
//Code
//p1 + p2 = "ab" + "abc"
//which has length 5.
//
//Example 2
//Input:
//
//Code
//s = "abc"
//Output:
//
//Code
//3
//Explanation: The entire string "abc" is exactly 
//𝑝
//2
//, so its length is 3.
//
//Constraints
//1
//≤
//𝑠
//.
//𝑙
//𝑒
//𝑛
//𝑔
//𝑡
//ℎ
//≤
//10
//5
//
//s consists only of lowercase English letters ('a'–'z').

public class HarmonicSubstring {
	public static String findHarmonic(int level) {
		
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < level; i++) {
			
			res.append((char)('a' + i));
		}
		return res.toString();
	}
	public static int getHarmonicStringLength(String s,int start) {
		
//		int i = start;
		int n = s.length();
		int i = start;
		int level = 2;
		int len = 0;
		
		while(i < n) {
			String harmonic = findHarmonic(level);
			
			if(i + harmonic.length() > n) {
				break;
			}
			
			String actualString = s.substring(i,i + harmonic.length());
			
			if(actualString.equals(harmonic)) {
				
				i += harmonic.length();
				len += harmonic.length();
				level++;
			}
			else {
				break;
			}
			
		}
		return len;
	}
	public static int longestHarmonicString(String s) {
		
		int n = s.length();
		
		char[] chars = s.toCharArray();
		
		int maxLen = 0;
		
		for(int i = 0; i < n - 2; i++) {
			
			if(s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
				
				int len = getHarmonicStringLength(s,i);
				
				maxLen = Math.max(maxLen, len);
			}
		}
		return maxLen;
	}
	public static void main(String[] args) {
		
		String s = "abc";
		System.out.println(longestHarmonicString(s));
	}
}
