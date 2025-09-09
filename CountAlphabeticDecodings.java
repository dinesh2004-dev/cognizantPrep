package cognizantPrep;

//Count Alphabetic Decodings
//Given a non-empty string S consisting only of digits '1' through '9', determine how many distinct ways it can be translated into letters using the mapping:
//
//'1' → A
//
//'2' → B
//
//…
//
//'26' → Z
//
//You may decode either one digit at a time (e.g. '2' → B) or any valid two-digit substring whose integer value is between 1 and 26 inclusive (e.g. '12' → L). Return the total count of unique decodings possible for the entire string.
//
//Function Signature
//plaintext
//int countDecodings(string S)
//Input Specification
//A single string S
//
//1 ≤ |S| ≤ 1,000
//
//Each character of S is a digit from '1' to '9'
//
//Output Specification
//An integer representing the number of distinct alphabetical decodings of S
//
//Examples
//Input	Output	Explanation
//"12"	2	"AB" (1-2) and "L" (12)
//"226"	3	"BZ" (2-26), "VF" (22-6), "BBF" (2-2-6)
//"7"	1	"G"
//Constraints and Notes
//You must account for all valid splits into single and two-digit numbers.
//
//Because S has no '0', every single digit is decodable on its own.
//
//The result may grow exponentially in the worst case (e.g., "111111…"), so ensure your solution handles large counts (up to 64-bit).
//
//Aim for an O(n) time and O(1) additional space dynamic-programming approach.

public class CountAlphabeticDecodings {
	
	public static int countDecoding(String num) {
		
		int n = num.length();
		
		int count = 0;
		
		for(int i = 0; i < n - 1; i++) {
			int num2 = Integer.parseInt(num.substring(i,i+2));
			
			if(num2 >= 1 && num2 <= 26) {
				count++;
			}
		}
		
		return count + n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "11292";
		
		int res = countDecoding(num);
		
		System.out.println(res);

	}

}
