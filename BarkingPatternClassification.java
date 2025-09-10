package cognizantPrep;

//Barking Pattern Classification
//Problem Statement
//You are monitoring a line of dogs barking on the street. Their bark sequences and silences are recorded in a single string S composed of:
//
//‘B’ for a single bark,
//
//One or more consecutive ‘B’s for rapid barks,
//
//‘_’ for a moment of silence.
//
//Each maximal run of consecutive ‘B’s represents one dog’s barking pattern (e.g., “B” for a single bark, “BB” for a double bark, “BBB” for a triple bark, etc.). Your task is to determine how many distinct barking‐pattern types appear in S.
//
//Input
//A string S of length n (1 ≤ n ≤ 10<sup>6</sup>), consisting only of the characters ‘B’ and ‘_’.
//
//Output
//An integer indicating the number of distinct barking‐pattern lengths found in S.
//
//Constraints
//1 ≤ |S| ≤ 10<sup>6</sup>
//
//S contains no characters other than ‘B’ and ‘_’.
//
//There is at least one ‘B’ in S.
//
//Example
//Input
//
//Code
//B_BB__BBB_B
//Output
//
//Code
//3
//Explanation The runs of consecutive ‘B’s are:
//
//“B” → length 1
//
//“BB” → length 2
//
//“BBB” → length 3
//
//“B” → length 1 (already counted)
//
//Distinct lengths = {1, 2, 3} → 3

import java.util.HashSet;
import java.util.Set;

public class BarkingPatternClassification {
	
	public static int identifyUniquePattern(String s) {
		
		char[] chars = s.toCharArray();
		
		int n = chars.length;
		
		int i = 0;
		
		Set<String> set = new HashSet<>();
		
		while(i < n) {
			
			StringBuilder temp = new StringBuilder();
			
			while(i < n && chars[i] == 'B') {
				temp.append(chars[i]);
				i++;
			}
			if(!temp.isEmpty()) {
				set.add(temp.toString());
				i--;
			}
			i++;
		}
		
		return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "B...BB....BBB.B";
		
		System.out.println(identifyUniquePattern(s));

	}

}
