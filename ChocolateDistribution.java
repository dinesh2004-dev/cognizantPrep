package cognizantPrep;

//Chocolate Distribution Problem(Prime Coding) 
//You are organizing a charity event in a village, where you distribute chocolates to children
// sitting in a circle. While the distribution of chocolates follows a specific set of rules based on
// their position in the circle: 
//The ith child receives i chocolates. If a child's position is adjacent to a multiple of 5, they 
//receive an additional 2 chocolates. 
//Given the number of children in a circle, your task is to calculate and return an integer value 
//representing the total number of chocolates distributed. 
//Note: Return mod of total to manage overflow with 1e9+7. 
//Input Specification: 
//input1: An integer value N, representing the number of children. 
//●
// Output Specification:
// Return an integer value representing the total number of chocolates distributed. 
//Example 1:
// input1: 
//5
// Output: 19 
//Explanation:
// Here N=5, so the chocolates each child receives while sitting in the circle is 
//●
// Child 1: 1 (since position is 1) and +2 (Additional gift), since they are sitting in circle 
//child 5 will be adjacent to child 1. So child 1 gets 3 chocolates. 
//●
// Child 2: 2 (since position 2) chocolates 
//●
// Child 3: 3 chocolates. 
//●
// Child 4: 6 chocolates (4 base + 2 additional) 
//●
// Child 5: 5 chocolates. 
//Addingchocolates of each child will give us 19 (3+2+3+6+5). Hence, 19 is returned as
// output.
// Example2: 
//Input1: 3
// Output: 6

public class ChocolateDistribution {
	
	public static int totalChoclates(int n) {
		
		int sumNnums = (n * (n + 1) )/ 2;
		
		return sumNnums + (n / 5) * 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
		
		int res = totalChoclates(n);
		
		System.out.println(res);

	}

}
