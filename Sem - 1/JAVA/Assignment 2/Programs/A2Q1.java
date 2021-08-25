import java.util.*;
class Employee{
	private int Emp_no , Basic_Salary;
	private String Emp_name , Designation;
	private float DA , HRA , GS , PF , IT , NS;
	
	public Employee(int Emp_no,String Emp_name,int Basic_Salary,String Designation){
		this.Emp_no = Emp_no;
		this.Emp_name = Emp_name;
		this.Basic_Salary = Basic_Salary;
		this.Designation = Designation;
	}
	
	void Calculates(){
		DA = (Basic_Salary/100)*60;
		HRA = (Basic_Salary/100)*25;
		GS = Basic_Salary + DA + HRA;
		
		PF = (GS/100)*12;
		IT = (GS/100)*10;
		
		NS = GS - (PF + IT);
	}
	
	void Display(){
		System.out.println("\n ===========Employee Info========");
		System.out.println("\n Employee Number : "+Emp_no);
		System.out.println("\n Employee Name : "+Emp_name);
		System.out.println("\n Employee Basic Salary : "+Basic_Salary);
		System.out.println("\n Employee Designation : "+Designation);
		System.out.println("\n Employee DA : "+DA);
		System.out.println("\n Employee HRA : "+HRA);
		System.out.println("\n Employee GS : "+GS);
		System.out.println("\n Employee PF : "+PF);
		System.out.println("\n Employee IT : "+IT);
		System.out.println("\n Employee Net Salary : "+NS);
					
	}
}

class A2Q1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee Id : ");
		int Emp_no = sc.nextInt();
		System.out.print("Enter the Employee Name : ");
		String Emp_name = sc.next();
		System.out.print("Enter the Employee Basic Salary : ");
		int Basic_Salary = sc.nextInt();
		System.out.print("Enter the Employee Designation : ");
		String Designation = sc.next();
	
		Employee e = new Employee(Emp_no,Emp_name,Basic_Salary,Designation);
		e.Calculates();
		e.Display();
	}
}
