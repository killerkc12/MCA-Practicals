import java.util.*;
class Publication{
	protected String title;
	protected float price;
	
	void getData(String title,float price){
		this.title=title;
		this.price=price;
	}
	
	void putData(){
		System.out.println("Title : "+title);
		System.out.println("Price : "+price);
	}
}

class Book extends Publication{
	private int page_count;
	
	void getData(String title,float price,int page_count){
		super.getData(title,price);
		this.page_count = page_count;
	}
	
	void putData(){
		System.out.println("\n Book");	
		super.putData();
		System.out.println("Page Count : "+page_count);		
	}
}

class Tape extends Publication{
	private float playing_time;
	
	void getData(String title,float price,float playing_time){
		super.getData(title,price);
		this.playing_time = playing_time;
	}
	
	void putData(){
		System.out.println("\n Tape");
		super.putData();
		System.out.println("Playing Time : "+playing_time);		
	}
}

class A2Q4{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Publication Title : ");
	String title = sc.next();
	System.out.print("Enter Publication Price : ");
	int price = sc.nextInt();
	System.out.print("Enter Number of Pages of Book : ");
	int pages = sc.nextInt();
	System.out.print("Enter Play Time of Tape :(in minutes) ");
	float play_timing = sc.nextFloat();
	
	Publication pub = new Publication();
	Book book = new Book();
	Tape tape = new Tape();
	
	pub.getData(title,price);
	book.getData(title,price,pages);
	tape.getData(title,price,play_timing);
	
	pub.putData();
	book.putData();
	tape.putData();
}
}
