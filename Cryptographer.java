package cognizantPrep;

//Cryptographer 18 Sep 2024 (Prime Coding) 
//An ancient journal was found containing an encrypted message. The encryption used in the
// journal shifts each character one position forward in the alphabet. For example 'a' becomes
// 'b', 'b' becomes 'c', and so on. However, 'z' wraps around and becomes 'a'. Alex, a
// cryptographer, needs to decrypt this journal by reversing the shift. Your task is to return the
// decryptedstring by shifting each character one position back in the alphabet. For example: 
//●
// Theletter 'b' becomes 'a', 'c' becomes 'b', and so on. 
//Iftheletter is 'a', it becomes 'z'. 
//●
// Note: Thejournal contains only lowercase English letters. 
//Input Specification: 
//input1:Astringvalue consisting of lowercase English letters 
//Output Specification: 
//Returnthedecryptedstring after shifting all the characters one position back 
//Example 1: 
//input1 : bcd
// Output: abc 
 
public class Cryptographer {
	public static String decrypt(String s) {
		char[] chars = s.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			int nextEle = ((chars[i] - 'a') % 26) - 1;
			if(nextEle == -1) {
				chars[i] = 'z';
				continue;
			}
			chars[i] = (char) (nextEle + 97);
		}
		
		return new String(chars);
	}
	public static void main(String[] arr) {
		String s = "erh";
		
		System.out.println(decrypt(s));
	}
}
