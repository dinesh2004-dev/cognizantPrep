package cognizantPrep;

//String Transformation
//Description
//You are given two uppercase strings, source and target. You may perform the following operations on source in any order:
//
//Remove any single character from source at cost 0.
//
//Swap any two characters in source at cost 0.
//
//Append a new character to the end of source at cost 1.
//
//Return the minimum total cost required to transform source into target.
//
//Examples
//Example 1:
//
//Code
//Input: source = "ABD", target = "AABCCAD"
//Output: 4
//Explanation:
//One optimal sequence of operations is:
//1. Append 'A'      -> "ABDA"      (cost 1)
//2. Swap last 'A' with 'D' -> "ABAD" (cost 0)
//3. Swap last 'A' with 'B' -> "ABAD"→"AABD" (cost 0)
//4. Append 'C', 'C' -> "AABCC"     (cost 2)
//5. Swap 'B' and last 'C' -> "AABCCD" (cost 0)
//6. Append 'D'      -> "AABCCDD"   (cost 1)
//7. Swap last 'D' into position -> "AABCCAD" (cost 0)
//Total cost = 1 + 2 + 1 = 4
//Example 2:
//
//Code
//Input: source = "ABC", target = "XYZ"
//Output: 3
//Explanation:
//Remove all characters from "ABC"              (cost 0)  
//Append 'X', 'Y', 'Z' to form "XYZ"            (cost 3)  
//Total cost = 3
//Constraints
//1 ≤ source.length, target.length ≤ 10⁵
//
//source and target consist only of uppercase English letters.

public class StringTransformation {
	public static int minCostToTransform(String s1,String s2) {
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		int[] hash1 = new int[26];
		int[] hash2 = new int[26];
		
		for(int i = 0; i < n1; i++) {
			
			char ch = Character.toLowerCase(s1.charAt(i));
			hash1[ch - 'a']++;
		}
		
		for(int i = 0; i < n2; i++) {
			
			char ch = Character.toLowerCase(s2.charAt(i));
			hash2[ch - 'a']++;
		}
		
		
		int minCost = 0;
		boolean visited[] = new boolean[26];
		for(int i = 0; i < n2; i++) {
			char ch = Character.toLowerCase(s2.charAt(i));
			
			if(!visited[ch - 'a']) {
				if(hash2[ch - 'a'] >= hash1[ch - 'a']) {
					
					minCost += hash2[ch - 'a'] - hash1[ch - 'a'];
					
				}
				
				visited[ch - 'a'] = true;
			}
		}
		return minCost;
	}
	public static void main(String[] args) {
		
		String s1 = "ABD";
		String s2 = "XYZ";
		
		int res = minCostToTransform(s1,s2);
		
		System.out.println(res);
	}
}
