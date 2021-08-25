import java.util.*;
class Date{
	private int year,month,day;
	String currentDate , birthDate;
	void acceptDate(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Birth Date : (yyyy-mm-dd) ");
		birthDate = sc.next();
		System.out.print("Enter the Current Date : (yyyy-mm-dd) ");
		currentDate = sc.next(); 
	}
	
	void dateDifference(){
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
		int CurrentDate[] = splitDate(currentDate);
		int BirthDate[] = splitDate(birthDate);
		
		if(BirthDate[2]>CurrentDate[2]){
			CurrentDate[1]--;
			CurrentDate[2] += months[BirthDate[1]-1]; 			
		}
		
		if(BirthDate[1]>CurrentDate[1]){
			CurrentDate[0]--;
			CurrentDate[1] += 12;
		}
		
		day = CurrentDate[2] - BirthDate[2];
		month = CurrentDate[1] - BirthDate[1];
		year = CurrentDate[0] - BirthDate[0];
	}
	
	static int[] splitDate(String date){
		String str[] = date.split("[-]");
		int a[] = new int[str.length];
		
		for(int i=0;i<str.length;i++){
			a[i] = Integer.parseInt(str[i]);
		}
		return a;
	}
	
	
	void displayDate(){
		System.out.println(year+"-"+month+"-"+day);
		System.out.println(year+" years "+month+" months "+day+" old");
	}
	
	
}
class A2Q2{
public static void main(String args[]){
	Date d = new Date();
	d.acceptDate();
	d.dateDifference();
	d.displayDate();
}
}
