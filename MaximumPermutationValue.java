package cognizantPrep;

//Maximum Permutation Value
//Description
//You are given an array of strings words of length n. For each string in words, remove all vowels (a, e, i, o, u, in both lowercase and uppercase). Let the length of the resulting consonant-only string be k. Treat each character position as distinct (even if characters are identical) and compute the number of permutations as k!. Your task is to return the maximum permutation count across all strings. If every transformed string has fewer than two consonants, return 0.
//
//Example 1
//Code
//Input: words = ["doll", "code", "car"]
//Output: 6
//Explanation: After removing vowels:
//
//"doll" → "dll" (k = 3) → 3! = 6
//
//"code" → "cd" (k = 2) → 2! = 2
//
//"car" → "cr" (k = 2) → 2! = 2
//
//The maximum is 6.
//
//Example 2
//Code
//Input: words = ["eio"]
//Output: 0
//Explanation: "eio" contains only vowels, so after removal it’s empty (k = 0). No permutations are possible.
//
//Constraints
//1 ≤ n ≤ 10^5
//
//1 ≤ words[i].length ≤ 10^5
//
//words[i] consists only of uppercase and lowercase English letters
//
//Sum of all words[i].length ≤ 10^6

public class MaximumPermutationValue {
	
	public static int fact(int n) {
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static int countVowel(String s) {
		
		String vowels = "aeiou";
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(vowels.indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		return count++;
	}
	public static int findMaxPermulation(String[] arr) {
		
		int n = arr.length;
		
		int maxi = 0;
		
		for(int i = 0; i < n; i++) {
			
			String s = arr[i];
			
			int vowelCount = countVowel(s);
			
			int k = s.length() - vowelCount;
			if(k != 0) {
				maxi = Math.max(maxi,fact(k));
			}
		}
		return maxi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] arr = {"doll", "code", "car"};
		String[] arr = {"eio"};
		
		int res = findMaxPermulation(arr);
		
		System.out.println(res);
	}

}
