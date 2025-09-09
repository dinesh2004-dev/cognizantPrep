package cognizantPrep;

//Dopamine Level Game
//John is playing a game where his dopamine level fluctuates as he evaluates a list of numbers. He first chooses a lower bound L and an upper bound R to define an inclusive range. Starting from a dopamine level of 0, he processes each element in an array A of length N:
//
//If an element falls within [L, R], his dopamine increases by 1.
//
//If an element falls outside that range, his dopamine decreases by 1.
//
//Your task is to determine the highest and lowest dopamine levels John reaches during this process and return them as a string in the format max - min.
//
//Input Specification
//input1: Integer N, the number of elements in the array.
//
//input2: Integer L, the lower bound of the range.
//
//input3: Integer R, the upper bound of the range.
//
//input4: Integer array A of length N.
//
//Output Specification
//Return a string showing two integers separated by -:
//
//The maximum dopamine level reached.
//
//The minimum dopamine level reached.
//
//Examples
//Example	N	L	R	A	Output	Explanation
//1	4	1	3	[4, 3, 2, 1]	2 - 1	Levels: 0→-1→0→1→2; max=2, min=−1
//2	3	1	4	[9, 3, 5]	0 - 1	Levels: 0→-1→0→-1; max=0, min=−1
//Constraints
//1 ≤ N ≤ 10^5
//
//–10^9 ≤ A[i], L, R ≤ 10^9
//
//L ≤ R

public class DopamineLevelGame {
	
	public static String[] findDopamineLevel(int[] arr,int L,int R) {
		
		int n = arr.length;
		
		int mini = 0;
		int maxi = 0;
		
		int dopamineLevel = 0;
		
		for(int ele : arr) {
			if(ele >= L && ele <= R) {
				dopamineLevel++;
			}
			else {
				dopamineLevel--;
			}
			
			mini = Math.min(mini, dopamineLevel);
			maxi = Math.max(maxi, dopamineLevel);
		}
		
		return new String[] {String.valueOf(mini),String.valueOf(maxi)};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,3,5};
		int L = 1;
		int R = 4;
		
		String[] res = findDopamineLevel(arr,L,R);
		
		System.out.println(res[1]+"  "+res[0]);
	}

}
