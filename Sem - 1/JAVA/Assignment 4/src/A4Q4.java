
class ReverseAlpha implements Runnable{

    @Override
    public void run() {
        char ch='Z';
        for(int i=0;i<15;i++){
            try {
                Thread.sleep(1000);
                System.out.print(ch+" ");
                ch--;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class PrimeNumber implements Runnable{
    @Override
    public void run() {
        int cnt=0;
        int n = 2;
        while (cnt<10) {
            boolean flag = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                try {
                    Thread.sleep(1000);
                    System.out.print(n + " ");
                    cnt++;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            n++;
        }
    }
}

class Alpha implements  Runnable{

    @Override
    public void run() {
        char ch='A';
        for(int i=0;i<15;i++){
            try {
                Thread.sleep(1000);
                System.out.print(ch+" ");
                ch++;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class A4Q4 {
    public static void main(String[] args) {
        ReverseAlpha reverseAlpha = new ReverseAlpha();
        Alpha alpha = new Alpha();
        PrimeNumber primeNumber = new PrimeNumber();
        Thread t1 = new Thread(reverseAlpha);
        Thread t2 = new Thread(alpha);
        Thread t3 = new Thread(primeNumber);
        t1.start();
        t2.start();
        t3.start();
    }
}
