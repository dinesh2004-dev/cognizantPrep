package cognizantPrep;
import java.util.*;

//Description
//Given a sentence S, partition it into words separated by single spaces. For each word, form a letter pair consisting of its first character and its last character. Count how many times each letter pair appears across all words, and return all pair(s) with the highest frequency.
//
//If multiple pairs tie for the maximum count, return them in the order they first appear in S.
//
//Input
//A string S representing the sentence.
//
//Words in S are separated by single spaces.
//
//S contains at least one word.
//
//S consists of uppercase and lowercase English letters and spaces.
//
//Output
//An array of strings, each string being a two-character letter pair (firstChar + lastChar), containing all most frequent pairs in their order of first occurrence.
//
//Examples
//Example 1:
//
//Code
//Input:  "he is good grid god and ground player plotter"
//Output: ["gd"]
//
//Explanation:
//Words and their pairs:
//"he" → "he"
//"is" → "is"
//"good" → "gd"
//"grid" → "gd"
//"god" → "gd"
//"and" → "ad"
//"ground" → "gd"
//"player" → "pr"
//"plotter" → "pr"
//
//Counts:
//"gd": 4, "pr": 2, "he":1, "is":1, "ad":1
//Most frequent = "gd"
//Example 2 (tie case):
//
//Code
//Input:  "ab ac bc ba"
//Output: ["ab", "ac", "bc", "ba"]
//
//Explanation:
//Each pair appears exactly once. Return all in their order of first appearance.
//Constraints
//1 ≤ S.length ≤ 10⁵
//
//Words are non-empty and separated by single spaces
//
//S contains only uppercase/lowercase letters and spaces

public class FrequentPair {
	
	public static String findFrequentPair(String s) {
		
		String[] arr = s.split(" ");
		
		Map<String,Integer> mpp = new LinkedHashMap<>();
		for(String str : arr) {
			
			
			
			String firstLast = ""+str.charAt(0) + str.charAt(str.length() -1);
			
			mpp.put(firstLast,mpp.getOrDefault(firstLast,0)+1);
			
		}
		
		String res = "";
		int maxi = 0;
		
		for(Map.Entry<String,Integer> map : mpp.entrySet()) {
			if(map.getValue() > maxi) {
				maxi = map.getValue();
				res = map.getKey();
			}
			
			
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "She is good grid god and ground player plotter";
		
		String res = findFrequentPair(s);
		
		System.out.println(res);
	}

}
