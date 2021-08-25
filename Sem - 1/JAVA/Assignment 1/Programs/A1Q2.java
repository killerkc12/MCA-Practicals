import java.util.*;
class A1Q2{
public static void main(String args[]){
	String s[] = new String[100];
	Scanner sn = new Scanner(System.in);
	System.out.print("Enter the number to be accept the String :");
	int n = sn.nextInt();
	
	System.out.println("Enter the "+n+" Strings :"); 
	for(int i=0;i<n;i++){
		s[i] = sn.next();
	}
	
	System.out.print("Strings are :");
	for(int i=0;i<n;i++){
		System.out.print(s[i]+" ");
	}
	System.out.println();
	
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(s[i].compareToIgnoreCase(s[j])>0){
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
		}
	}
	
	System.out.print("Sorted String Array :");
	for(int i=0;i<n;i++){
		System.out.print(s[i]+" ");
	}
	System.out.println();
}
}
