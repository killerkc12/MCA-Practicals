import java.util.*;
class Employee{
	private int eno;
	private String name;
	Scanner sc = new Scanner(System.in);
	
	public void getEmp(){
		System.out.println("\n===== Employee Details =====");
		System.out.print("Enter the Employee Number : ");
		eno = sc.nextInt();
		System.out.print("Enter the Employee Name : ");
		name = sc.next();
	}
	public void showEmp(){
		System.out.println("\n===== Employee Details =====");
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name : "+name);
	}
}

class Personal extends Employee{
	private String adds,city;
	private long phno;
	
	public void getInfo(){
		super.getEmp();
		System.out.println("\n===== Employee Personal Details =====");
		System.out.print("Enter the Employee Address : ");
		adds = sc.next();
		System.out.print("Enter the Employee City : ");
		city = sc.next();
		System.out.print("Enter the Employee phone Number : ");
		phno = sc.nextLong();
	}
	public void showInfo(){
		super.showEmp();
		System.out.println("\n===== Employee Personal Details =====");
		System.out.println("Employee Address : "+adds);
		System.out.println("Employee City : "+city);
		System.out.println("Employee Phone Number : "+phno);
	}
}

class Salary extends Personal{
	private float Basic , GS , NS;
	private float DA , HRA , PF , IT;

	public void AcceptDetails(){
		super.getInfo();
		System.out.println("\n===== Employee Salary Details =====");
		System.out.print("Enter the Employee Basic Salary : ");
		Basic = sc.nextFloat();
	}
	public void Calculate(){
		DA = (Basic/100)*60;
		HRA = (Basic/100)*25;
		GS = Basic + DA + HRA;
		
		PF = (GS/100)*12;
		IT = (GS/100)*10;
		
		NS = GS - (PF + IT);
	}
	public void showSalary(){
		super.showInfo();
		System.out.println("\n===== Employee Salary Details =====");
		System.out.println("Employee Basic Salary : "+Basic);
		System.out.println("Employee DA : "+DA);
		System.out.println("Employee HRA : "+HRA);
		System.out.println("Employee GS : "+GS);
		System.out.println("Employee PF : "+PF);
		System.out.println("Employee IT : "+IT);
		System.out.println("Employee NS : "+NS);
	}
	
}

class Main{
	public static void main(String args[]){
		Salary s = new Salary();
		s.AcceptDetails();
		s.Calculate();
		s.showSalary();
	}
}
