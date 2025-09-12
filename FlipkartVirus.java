package cognizantPrep;

//Flipkart Virus 
//
//Flipkart has been infected with a virus, the virus works this way: Each user that has been 
//infected with the virus is traced by a special algorithm and a hint that the virus gives. The 
//virus leaves a hint number N. Flipkart is able to identify the user ID of the virus by this N 
//number as the user ID works as a series : Each number in the series is the sum of the last 
//three numbers in the series. The first three numbers in the series are 0, 0, 1 always. Write a 
//program to identify the user ID infect based on N value checked from the logs of the system 
// 
//Input 
// 
//The input contains the N value left by the virus and found by engineers in the logs of the 
//system 
//Output 
//Print the userID of the infect user. 
// 
//Example Input 
//11 
//Output 
//81 

public class FlipkartVirus {
	
	public static int flipkartVirus(int n) {
		if(n == 1 || n == 2) {
			return 0;
		}
		if(n == 3) {
			return 1;
		}
		int a = 0,b = 0, c = 1;
		
		for(int i = 4; i <= n; i++) {
			int d = a + b + c;
			
			a = b;
			b = c;
			c = d;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		
		System.out.println(flipkartVirus(n));

	}

}
