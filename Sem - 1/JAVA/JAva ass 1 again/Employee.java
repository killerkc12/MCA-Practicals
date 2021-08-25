import java.util.*;
class Employee{
	private int eno;
	private String name;
	Scanner sc = new Scanner(System.in);
	public void getEmp(){
		System.out.println("Enter the Employee Number : );
		eno = sc.nextInt();
		System.out.println("Enter the Employee Name : ):
		name = sc.nextLine();
	}
	public void showEmp(){
		System.out.println("Employee Number : "+eno);
		System.our.println("Employee Name : "+name);
	}
}

class Personal extends Employee{
	private String adds,city;
	private long phno;
	public void getinfo(){
		
	}
}

class Salary extends Personal{
	private float Basic , Gs , Ns;
	private float Da , Hra , Pf , It;

	
}

class Main(){
	public static void main(String args[]){
		Salary s = new Salary();
		s.getEmp();
		s.showEmp();
	}
}
