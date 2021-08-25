import java.util.Scanner;

interface SearchInteger{
    void linearSearch();
    void binarySearch();
}

public class NumberSearch implements SearchInteger{
    int arr[];
    int n ;
    boolean flag ;
    public NumberSearch(int arr[],int n){
        this.arr = arr;
        this.n = n;
    }

    public void linearSearch() {
        for (int a : arr){
            if (a == n)
                flag = true;
        }
        if (flag)
            System.out.println("Element is Found");
        else
            System.out.println("Element is not Found");
    }

    public void binarySearch() {
        int l = 0;
        int r = arr.length -1;
        while (l<=r){
            int mid = l + (r-l)/2;

            if (arr[mid] == n){
                flag  = true;
                break;
            }
            if (n > arr[mid])
                l = ++mid;
            else
                r = --mid;
        }
        if (flag)
            System.out.println("Element is Found");
        else
            System.out.println("Element is not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,6,23,67,87};
        System.out.println("Given Array is ");
        for (int a : arr)
            System.out.print(a+" ");
        System.out.print("\nEnter the Element to be Search : ");
        int n = sc.nextInt();
        NumberSearch search = new NumberSearch(arr,n);
        System.out.println("1.Linear Search");
        System.out.println("2.Binary Search");
        System.out.print("Enter the Choice : ");
        int ch = sc.nextInt();
        switch (ch){
            case 1 : search.linearSearch();
                break;
            case 2 : search.binarySearch();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
