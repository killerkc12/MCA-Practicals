class Fibonacci extends Thread{

    @Override
    public void run() {
        int n1=0,n2=1,cnt=10;

        try {
            Thread.sleep(1000);
            System.out.println(n1);
            Thread.sleep(1000);
            System.out.println(n2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=2;i<cnt;i++){
            int n3=n1+n2;
            System.out.println(n3);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n1=n2;
            n2=n3;
            try {

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MathTable extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyName extends Thread{
    String name ;
    MyName(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=0;i<15;i++){
            try {
                Thread.sleep(1000);
                System.out.println(name);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class A4Q3{
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        MathTable mathTable = new MathTable();
        MyName myName = new MyName("Kiran");
        Thread t1 = new Thread(fibonacci);
        Thread t2 = new Thread(mathTable);
        Thread t3 = new Thread(myName);
        t1.start();
        t2.start();
        t3.start();
    }
}
