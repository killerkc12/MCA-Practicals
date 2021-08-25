import java.util.Scanner;

class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}

public class SeniorCitizen{

    public void AcceptDetails(int age) throws AgeException{
        try {
            if (age < 60)
                throw new AgeException("Invalid Age Exception");
            else
                System.out.println("Successful Registration!");
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws AgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("======= Senior Citizen Details ======");
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter Address : ");
        String address = sc.nextLine();
        sc.next();
        System.out.print("Enter City : ");
        String city = sc.nextLine();
        sc.next();

        SeniorCitizen seniorCitizen = new SeniorCitizen();
        seniorCitizen.AcceptDetails(age);
    }
}