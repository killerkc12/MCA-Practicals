import java.util.*;
public class A1Q1{
public static void main(String arg[]){
	int i,n=10;
	int[] a = new int[n]; 
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter the 10 numbers : ");
	for(i=0;i<n;i++){
		a[i]= sn.nextInt();
	}
	
	System.out.print("Elements are : ");
	for(i=0;i<n;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	for(i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]>a[j]){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
	}
	
	System.out.print("Sorted Elements are : ");
	for(i=0;i<n;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	System.out.println("Second Largest No is :"+a[n-2]);
	System.out.println("Second Smallest No is :"+a[1]);
}
}
