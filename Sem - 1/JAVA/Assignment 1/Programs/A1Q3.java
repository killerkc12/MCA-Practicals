import java.util.*;
class A1Q3{
public static void main(String args[]){
	Scanner sn = new Scanner(System.in);
	System.out.print("Enter first Number :");
	int x = sn.nextInt();
	System.out.print("Enter Second Number :");
	int y = sn.nextInt();
	int gcd = 1;
	for(int i=1;i<=x && i<=y;i++){
		if(x%i==0 && y%i==0){
		gcd = i;
		}
	}
	
	System.out.println("GCD of "+x+" & "+y+" is :"+ gcd);
	
	int lcm = (x*y)/gcd;
	
	System.out.println("LCM of "+x+" & "+y+" is : "+lcm);
}
}
