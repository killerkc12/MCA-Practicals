public class Multi3 extends Thread{

    void fibonacci(){
        try{

            int n1=0,n2=1,n3,i,count=10;
            System.out.print(n1+" "+n2);
            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.println(" "+n3);
                n1=n2;
                n2=n3;
                Thread.sleep(100);
            }
        }catch(Exception e){System.out.println(""+e); }
    }

    void table20(){
        try{
            for(int i =1;i<=10;i++){
                System.out.println(20*i+"");
                Thread.sleep(100);
            }
        }catch(Exception e){System.out.println(""+e); }
    }

    void displayname(){
        try{
            for(int i =1;i<=20;i++){
                System.out.println("Ganesh");
                Thread.sleep(100);
            }
        }catch(Exception e){System.out.println(""+e); }
    }
    public void run(){
        System.out.println();
        if(this.getName().equals("Thread-0"))
        {
            this.fibonacci();
        }
        if(this.getName().equals("Thread-1"))
        {
            this.table20();
        }
        if(this.getName().equals("Thread-2"))
        {
            this.displayname();
        }
    }
    public static void main (String arg[]){
        Multi3 m1 =new Multi3();
        Multi3 m2 =new Multi3();
        Multi3 m3 =new Multi3();
        m1.start();
        m2.start();
        m3.start();
    }
}