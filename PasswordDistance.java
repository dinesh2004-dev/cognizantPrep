package cognizantPrep;
import java.util.*;

//Password Distance Problem(Prime Coding) 
//Jim has a password represented by a string S consisting of lowercase English letters (a-z)
// and digits (0-9). The distance between two characters is defined as the absolute difference
// between their indices in the string. Your task is to find and return the maximum distance
// between two non-similar characters within the given password S. 
//Note: The distance between two adjacent characters is 1. 
//Input Specification: 
//input1: A string S containing lowercase English letters (a-z) and digits (0-9). 
//●
// Output Specification: 
//●
// Return an integer representing the maximum distance between two non-similar 
//characters within the given password S. 
//Example 1: 
//●
// Input: abc10 
//●
// Output: 4 
//Explanation: 
//Inthestringabc10, the maximum distances between non-similar characters are: 
//1. Between a and 0 (indices 0 and 4): Distance is 4. 
//2. Between b and 0 (indices 1 and 4): Distance is 4. 
//Other combinations yield a shorter distance. Therefore, the maximum distance between two
// non-similar characters is 4.
// Example 2: 
//●
// Input: bbbb 
//●
// Output: 0 
//Explanation:
// In the string bbbb, all characters are the same, so there are no two non-similar characters to 
//compare. Thus, the maximum distance between two non-similar characters is 0.

public class PasswordDistance {
	
	public static int findMaxDistance(String password) {
		
		int maxDistance = 0;
		
		for(int i = 0; i < password.length(); i++) {
			
			for(int j = i; j < password.length(); j++) {
				
				if(password.charAt(i) != password.charAt(j)) {
					
					maxDistance = Math.max(maxDistance, j - i );
				}
			}
		}
		return maxDistance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "bbbb";
		
		int res =  findMaxDistance(password);
		
		System.out.println(res);
	}

}
