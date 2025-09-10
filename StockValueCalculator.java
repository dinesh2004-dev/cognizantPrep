package cognizantPrep;

//Stock Value Calculator
//Problem Statement
//You are given a string S that encodes multiple products, each with a name, a price, and a quantity. Product entries are separated by commas, and within each entry the fields are separated by colons.
//
//Your goal is to compute the total value of all products in stock by summing up (price × quantity) for every product listed in S.
//
//Input
//A single string S in the format: Product1:Price1:Quantity1,Product2:Price2:Quantity2,...
//
//Output
//An integer representing the total stock value.
//
//Constraints
//1 ≤ number of products ≤ 10⁵
//
//0 ≤ Price<sub>i</sub>, Quantity<sub>i</sub> ≤ 10⁶
//
//Product names contain only uppercase and lowercase letters
//
//The input string contains no extra whitespace
//
//Example
//Input
//
//Code
//Apple:250:10,Banana:120:15,Orange:300:5
//Output
//
//Code
//5800
//Explanation
//
//Apple contributes 250 × 10 = 2500
//
//Banana contributes 120 × 15 = 1800
//
//Orange contributes 300 × 5 = 1500
//
//Total = 2500 + 1800 + 1500 = 5800

public class StockValueCalculator {
	
	public static int calculateStockValue(String s) {
		
		String[] arr = s.split(",");
		
		int totalValue = 0;
		
		for(String str : arr) {
			
			String[] product = str.split(":");
			
			int price = Integer.parseInt(product[1]);
			int qty = Integer.parseInt(product[2]);
			
			totalValue += price * qty;
		}
		
		return totalValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Apple:250:10,Banana:120:15,Orange:300:5";
		
		System.out.println(calculateStockValue(s));
	}

}
