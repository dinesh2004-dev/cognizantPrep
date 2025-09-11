package cognizantPrep;

//Count Homogeneous Layers in a String
//Problem Description
//You are given a string s consisting of lowercase English letters. You want to build successive “layers” from s as follows:
//
//The 1st layer uses 1 character.
//
//The 2nd layer uses 2 characters.
//
//The 3rd layer uses 3 characters.
//
//And so on…
//
//You continue building layers in this way until there aren’t enough characters left in s to form the next full layer. A layer is homogeneous if all the characters in that layer are identical.
//
//Return the total number of homogeneous layers you can form.
//
//Function Signature
//python
//class Solution:
//    def countHomogeneousLayers(self, s: str) -> int:
//Examples
//Example 1:
//
//Code
//Input:  s = "aaabbbcccdddddd"
//Output: 4
//Explanation:
//  Layer 1 (size=1):  "a"       → homogeneous
//  Layer 2 (size=2):  "aa"      → homogeneous
//  Layer 3 (size=3):  "bbb"     → homogeneous
//  Layer 4 (size=4):  "cccc"    → homogeneous
//  Layer 5 (size=5):  "ddddd"   → homogeneous?  
//    Actually we only have 6 d’s left; we can form size-5 layer "ddddd" (homogeneous),  
//    but size-6 layer would need 6 characters and there is only 1 left.  
//  However, we stop at size-5 → we count layers 1,2,3,4,5 → total 5.
//Example 2:
//
//Code
//Input:  s = "abcde"
//Output: 1
//Explanation:
//  Layer 1 (size=1):  "a"     → homogeneous
//  Layer 2 (size=2):  "bc"    → not homogeneous
//  We cannot form Layer 3 because only 3 characters remain.
//  Total homogeneous layers = 1.
//Constraints
//1 <= s.length <= 10^5
//
//s consists only of lowercase English letters ('a'–'z').
public class CountHomogeneousString {
	public static int countHomogeneousLayers(String s) {
		
		int n = s.length();
		int curr = 0;
		int layer = 1;
		int homogeneous = 0;
		
		while(curr + layer <= n) {
			
			char first = s.charAt(curr);
			
			boolean homoFlag = true;
			
			for(int i = 1; i < layer; i++) {
				
				if(s.charAt(curr + i) != first){
					homoFlag = false;
					break;
				}
			}
			if(homoFlag) {
				homogeneous++;
			}
			curr += layer;
			layer++;
		}
		return homogeneous;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcccdddddd"; 
        System.out.println(countHomogeneousLayers(s));

	}

}
