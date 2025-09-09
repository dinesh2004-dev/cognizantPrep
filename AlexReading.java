package cognizantPrep;

import java.util.*;

//Alex’s Reading Problem(Prime Coding) 
//Alex is a high school student who loves reading and has a summer break coming up. He has
// a list of books he wants to read, with each book’s estimated reading time stored in an array
// A. Alex has N hours available during the break for reading. Your task is to help Alex
// determine the maximum number of books he can read without exceeding his total available
// reading hours. 
//Input Specification: 
//●
// ●
// ●
// input1: An integer array A, where each element represents the estimated time to read
// each book. 
//input2: An integer N, representing the total number of hours Alex has available for
// reading. 
//input3: An integer size, representing the size of the array A. 
//Output Specification: 
//●
// Return an integer value representing the maximum number of books Alex can read 
//without exceeding his total available reading hours. 
//Example 1: 
//●
// ●
// ●
// input1: [4, 2, 3, 1] 
//input2: 5 
//input3: 4 
//Output: 2 
//Explanation: 
//Here N=5 and Alex has 4 books with reading times of 4, 2, 3, and 1 respectively then 
//●
// The optimal way to utilize the 5 hours is to read the books with reading times of 2 and 
//1hour. 
//●
// Ifhe starts reading the book within 3 hours, then it will exceed the time limit. 
//The maximum number of books that can be read is 2. 
//Hence,2is returned as output.


public class AlexReading {
	public static int findMaxBooksRead(int[] hours,int availableHrs) {
		
		int maxBooksToRead = 0;
		Arrays.sort(hours);
		
		for(int hr : hours) {
			
			if(availableHrs - hr < 0) {
				
				return maxBooksToRead;
			}
			availableHrs = availableHrs - hr;
			maxBooksToRead++;
		}
		
		return maxBooksToRead;
		
	}
	public static void main(String[] args) {
		int[] hours = {4, 2, 3, 1};
		int availableHrs = 5;
		
		int res = findMaxBooksRead(hours,availableHrs);
		
		System.out.println(res);
	}
}
