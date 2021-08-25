import java.util.*;
class Employee{
	protected int Basic_Salary;
	protected float HRA , CEA;
	
	public Employee(int bs){
		this.Basic_Salary = bs;
	} 
	
	void calculate(){
		float total = Basic_Salary + HRA + CEA;
		System.out.println("========================");
		System.out.println("Basic Salary : "+Basic_Salary);
		System.out.println("HRA : "+HRA);
		System.out.println("Chil Education Allowance : "+CEA);
		System.out.println("Total Salary :"+total);
	}
}

class Manager extends Employee{
	public Manager(int sal){
		super(sal);
		this.HRA = ((Basic_Salary/100)*20);
	}
}

class HOD extends Manager{
	public HOD(int sal){
		super(sal);
		this.CEA = ((Basic_Salary/100)*10);
	}
}

class A2Q3{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Basic Salary : ");
	int sal = sc.nextInt();
	

	
	System.out.println("\n Employee Salary : ");
	Employee emp = new Employee(sal);
	emp.calculate();
	
	System.out.println("\n Manager Salary : ");
	Manager mng = new Manager(sal);
	mng.calculate();
	
	System.out.println("\n HOD Salary : ");
	HOD hod = new HOD(sal);
	hod.calculate();
}
}
