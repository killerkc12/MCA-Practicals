import java.util.*;
class A1Q4{
public static void main(String args[]){
	Scanner sn = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String str = sn.nextLine();
	
	int a[] = new int [256];
	
	for(int i=0;i<str.length();i++){
		a[str.charAt(i)]++;
	}
	
	str = str.replace(" ","");
	char ch[] = str.toCharArray();
	for(int i=0;i<ch.length;i++){
		int cnt = 0;
		for(int j=0;j<ch.length;j++){
			if(j<i && ch[i]==ch[j])
				break;
			
			if(ch[i]==ch[j])
				cnt++;
		}
		
		if(cnt>0)
			System.out.println("Occurance of "+ch[i]+" is "+cnt);
	}
}
}
