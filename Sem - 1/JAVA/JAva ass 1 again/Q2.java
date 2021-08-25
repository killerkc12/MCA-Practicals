import java.util.*;

class Student{
	private int rno;
	private String name;
	
	Scanner sc = new Scanner(System.in);
	
	public void getStudent(){
		System.out.println("\n===== Student Details =====");
		System.out.print("Enter the Student Roll Number : ");
		rno = sc.nextInt();
		System.out.print("Enter the Student Name : ");
		name = sc.next();
	}
	public void showStudent(){
		System.out.println("\n===== Student Details =====");
		System.out.println("Student Roll Number : "+rno);
		System.out.println("Student Name : "+name);
	}
}

class Science extends Student{
	private int math,sci;
	public void getScience(){
		super.getStudent();
		System.out.println("\n===== Science Student Details =====");
		System.out.print("Enter the Student Math Marks : ");
		math = sc.nextInt();
		System.out.print("Enter the Student Science Marks : ");
		sci = sc.nextInt();
	}
	public void showScience(){
		super.showStudent();
		System.out.println("\n===== Science Student Details =====");
		System.out.println("Math Marks : "+math);
		System.out.println("Science Marks : "+sci);
	}
}

class Arts extends Student{
	private int eng,eco;
	public void getArts(){
		super.getStudent();
		System.out.println("\n===== Arts Student Details =====");
		System.out.print("Enter the Student English Marks : ");
		eng = sc.nextInt();
		System.out.print("Enter the Student Economic Marks : ");
		eco = sc.nextInt();
	}
	public void showArts(){
		super.showStudent();
		System.out.println("\n===== Arts Student Details =====");
		System.out.println("English Marks : "+eng);
		System.out.println("Economic Marks : "+eco);
	}
}

class Commerce extends Student{
	private int acc,finance;
	public void getCommerce(){
		super.getStudent();
		System.out.println("\n===== Commerce Student Details =====");
		System.out.print("Enter the Student Account Marks : ");
		acc = sc.nextInt();
		System.out.print("Enter the Student Finance Marks : ");
		finance = sc.nextInt();
	}
	public void showCommerce(){
		super.showStudent();
		System.out.println("\n===== Commerce Student Details =====");
		System.out.println("Account Marks : "+acc);
		System.out.println("Finance Marks : "+finance);
	}
}

class Q2{
	public static void main(String args[]){
		Science science = new Science();
		Arts arts = new Arts();
		Commerce commerce = new Commerce();
		
		science.getScience();
		arts.getArts();
		commerce.getCommerce();
		
		arts.showArts();
		science.showScience();
		commerce.showCommerce();
	}
}
