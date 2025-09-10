package cognizantPrep;

//Workshop Registration Counter
//Problem Statement
//A school is organizing workshops held between a given start date and end date (inclusive). Students register on various dates, each formatted as dd-mm-yyyy. Given the full list of registration dates, determine how many students registered within the valid workshop period.
//
//Input Specification
//n (integer): the number of registration entries.
//
//registrations (array of strings): each entry is a date in the format dd-mm-yyyy.
//
//startDate (string): the workshop start date, in dd-mm-yyyy.
//
//endDate (string): the workshop end date, in dd-mm-yyyy.
//
//Output Specification
//Return an integer representing the count of registration dates that fall on or after startDate and on or before endDate.
//
//Constraints
//1 ≤ n ≤ 10<sup>5</sup>
//
//All dates are valid and follow the dd-mm-yyyy format.
//
//startDate ≤ endDate chronologically.
//
//Example Test Cases
//Example 1
//Input
//
//Code
//n = 6  
//registrations = ["01-01-2023", "10-01-2023", "05-02-2023", "25-12-2022", "03-01-2023", "01-01-2023"]  
//startDate = "01-01-2023"  
//endDate   = "31-01-2023"  
//Output
//
//Code
//3
//Explanation Valid registration dates in January 2023 are:
//
//01-01-2023
//
//10-01-2023
//
//03-01-2023
//
//Example 2
//Input
//
//Code
//n = 4  
//registrations = ["30-11-2022", "01-12-2022", "05-12-2022", "01-01-2023"]  
//startDate = "01-12-2022"  
//endDate   = "31-12-2022"  
//Output
//
//Code
//2
//Explanation Valid registration dates in December 2022 are:
//
//01-12-2022
//
//05-12-2022
//
//Additional Test Case
//Input
//
//Code
//n = 5  
//registrations = ["15-03-2021", "16-03-2021", "14-03-2021", "17-03-2021", "18-03-2021"]  
//startDate = "16-03-2021"  
//endDate   = "17-03-2021"  
//Output
//
//Code
//2
//Explanation Registrations on 16-03-2021 and 17-03-2021 fall within the period.

public class WorkshopRegistrationCounter {
	public static int[] parse(String date) {
		String[] temp = date.split("-");
		int[] arr = new int[3];
		
		arr[0] = Integer.parseInt(temp[0]);
		arr[1] = Integer.parseInt(temp[1]);
		arr[2] = Integer.parseInt(temp[2]);
		
		return arr;
	}
	public static int comp(int[] a,int[] b) {
		
		int diff = a[2] - b[2];
		
		if(diff != 0) {
			return diff;
		}
		
		diff = a[1] - b[1];
		
		if(diff != 0) {
			return diff;
		}
		
		return a[0] - b[0];
	}
	public static int countValidRegistration(int n,String[] registrations,String startDate,String endDate) {
		
		int start[] = parse(startDate);
		int end[] = parse(endDate);
		
		int cnt = 0;
		for(String s: registrations) {
			int curr[] = parse(s);
			
			if(comp(curr,start) >= 0 && comp(curr,end) <= 0) {
				
				cnt++;
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;  
		String[] registrations = {"01-01-2023", "10-01-2023", "05-02-2023", "25-12-2022", "03-01-2023", "01-01-2023"};  
		String startDate = "01-01-2023";  
		String endDate   = "31-01-2023";  
		
		System.out.println(countValidRegistration(n,registrations,startDate,endDate));


	}

}
