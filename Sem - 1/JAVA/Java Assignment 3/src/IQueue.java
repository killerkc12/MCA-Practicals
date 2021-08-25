import java.util.Scanner;

interface IntegerQueue{
    void insert(int n);
    int remove();
    void Display();
}

public class IQueue implements IntegerQueue {
    private int[] arr;
    private  int front;
    private  int rear;
    private int size;

    IQueue(int size){
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public  void insert(int n){
        if (isFull()){
            System.out.println("\n Overflow!");
            return;
        }
        if (isEmpty()){
            front++;
            arr[++rear] = n;
        }
        else
            arr[++rear] = n;
        System.out.println("\n Number Inserted!");
    }

    public int remove(){
        if (isEmpty()){
            System.out.println("\n Underflow!");
            return 0;
        }
        front = (front + 1) % size;
        System.out.println("Number Removed");
        return 0;
    }

    public void Display(){
        if (isEmpty()){
            System.out.println("\n Queue is underFlow!");
            return;
        }
        System.out.print("Queue is : ");
        for (int i = front;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public  Boolean isEmpty(){
        return (rear == -1 &&  front == -1);
    }

    public Boolean isFull(){
        return (rear == size-1);
    }

    public static void main(String[] args) {
        IQueue iQueue = new IQueue(5);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n ===== Queue Implementation =====");
            System.out.println("1.Inset");
            System.out.println("2.Remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter the choice : ");
            int ch = sc.nextInt();
            switch (ch){
                case 1 :
                    System.out.print("Enter the Element : ");
                    int n = sc.nextInt();
                    iQueue.insert(n);
                break;
                case 2 : iQueue.remove();
                break;
                case 3 : iQueue.Display();
                break;
                case 4 : System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

}
