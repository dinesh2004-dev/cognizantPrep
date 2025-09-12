package cognizantPrep;

//Amazon Cryptography 
//Amazon wants to apply cryptography to its barcode scanner printed on items. Each item 
//already has an item number, your job is to generate this cryptographed barcode number that 
//will be printed, which should follow the following rule: 
//Accept a crypto key C from the user, the item number replaced is then replaced with barcode 
//number such that each barcode digit is the Cth digit in the case if the result is less than 10. 
//Else, a character in general alphabets post 10. 
//See the input and output below to understand the solution. 
//Input format: 
//First input contains the order number and the 2nd input contains the crypto key C 
//Output format: 
//Print the order number 
//Example Input  
//46734  
//2 
//Output  
// 
//68956 

public class AmazonCryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  num = "46738";
		
		int c = 2;
		
		StringBuilder res = new StringBuilder();
		
		for(char ch : num.toCharArray()) {
		
		  int val = (ch - '0') + c; 
          if (val < 10) res.append(val); 
          else res.append((char)('A' + val - 10)); 
		}
		
		for(char ch : res.toString().toCharArray()) {
			System.out.print(ch);
		}
		
		

	}

}
