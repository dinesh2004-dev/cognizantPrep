package cognizantPrep;

//Pen Switching Problem(Prime Coding) 
//You are a teacher creating an engaging math activity for your students by writing N numbers
// on the classroom whiteboard. You use a green pen for odd numbers and a red Join Pen for
// even numbers. Your task is to find and return an integer value representing the number of
// times you need to switch from the green pen to the red pen while writing these numbers.
// Input Specification: 
//input1: An integer value N 
//●
// ●
// input2: An integer array representing the numbers to be written 
//Output Specification:
// Return an integer value representing the number of times you need to switch from the green 
//pen to the red pen while writing these numbers. 
//Example 1:
// input1 : 5
// Input2: (1,2,1,6,10,9)
// Output: 2 
//Explanation:
// The given sequence which he has to write is 1->2->1->6->10->9 
//Below is the sequence of pen, the teacher has to use: 
//1. Green pen to write 1 
//2. Red pen to write 2 
//3. Green pen to write 1 
//4. Red pen to write 6 and 10 
//5. Green pen to write 9 
//Therefore, we need to change from green pen to red twice. Hence, 2 is returned as output. 
//Example 2:
// input1: 6
// input2: (70,23,13,26,72,19)
// Output: 1 
//Explanation:
// The given sequence which he has to write is 70->23->13->26->72->19 
// 
public class PenSwitch {
	public static int penSwitch(int[] arr) {
		int switches = 0;
		boolean prev = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				prev = (arr[i] % 2 == 0) ? false : true;
			}
			if(arr[i] % 2 == 0 && prev) {
				switches++;
				prev = false;
			}
			else if(arr[i] % 2 != 0){
				prev = true;
				
			}
		}
		
		return switches;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,6,10,9};
		int res = penSwitch(arr);
		System.out.println(res);
	}

}
