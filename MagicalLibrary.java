package cognizantPrep;
import java.util.Arrays;

//Magical Library 18 Sep 2024 (Prime Coding) 
//In a magical library, each bookshelf is represented by a two-dimensional array A, where
// each row of the 2D array A[i] represents the series value of a book. 
//A row is considered magical if the sum of the odd values of the series of a book is even. 
//Your task is to find and return an integer value representing the number of magical rows. 
//Input Specification: 
//input1: An integer value representing the number of rows in the 2D array. 
//●
// ●
// ●
// input2: An integer value representing the number of columns in the 2D array. 
//input3: A 2D integer array where each row represents a series of books. 
//Output Specification:
// Example 1: 
//Return an integer value representing the number of magical rows. 
//input1: 3
// input2:3
// input3: ((1, 2, 3), (4, 5, 6), (7, 8, 9))
// Output: 2 
//Explanation: 
//Here,the given 2D array is {{1, 2, 3} , {4, 5, 6}, {7, 8, 9}} 
//● 
//In the first row {1, 2, 3} the odd numbers are {1, 3} and their sum is 4 which is even. 
//● 
//In the second row {4, 5, 6} the odd numbers are {5} and as there is only one odd 
//element so the sum is 5 which is odd. 
//● 
//In the third row {7, 8, 9} the odd numbers are {7, 9} and their sum is 16 which is even. 
//Therefore, there are only 2 magical rows so, 2 is returned as the output. 
//Example 2:
// input1 : 3
// input2 : 2
// input3: {{2, 4} (0,0), {11, 11}}
// Output: 1 
//Explanation: 
//Here, the given 2D given array {{2, 4} (0,0), {11, 11}}, 
//Only the last row {11, 11} has odd elements and their sum is 22 which is even. Therefore, 
//there is only 1 magical row so 1 is returned as the output.

public class MagicalLibrary {
    public static int findMagicalRow(int[][] a) {
    	int magicalRow = 0;
    	for(int[] arr : a) {
    		int oddCount = (int) Arrays.stream(arr)
    								   .filter(x -> x % 2 != 0)
    								   .count();
//    		System.out.println(oddCount);
    		if(oddCount > 0 && oddCount % 2 == 0) {
    			magicalRow++;
    		}
    	}
    	return magicalRow;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a =   {{2, 4},{0,0},{11, 11}};
		
		int res = findMagicalRow(a);
		
		System.out.println(res);
	}

}
