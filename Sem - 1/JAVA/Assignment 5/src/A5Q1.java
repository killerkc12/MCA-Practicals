import java.util.ArrayList;
import java.util.Collections;

public class A5Q1 {
    public static void main(String[] args) {

//        Create an ArrayList of integer numbers.
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.print("ArrayList : ");
        System.out.print(arrayList);

//        Add element at specific position in ArrayList.
        arrayList.add(2,100);
        System.out.print("\n 100 add in the postion 2");
        arrayList.add(4,80);
        System.out.print("\n 80 add in the postion 4");

//        Remove element from specific position ArrayList
        System.out.print("\nRemoved Element "+arrayList.get(0)+" from  position "+ 0);
        arrayList.remove(0);

//        Reverse elements in ArrayList.
        System.out.print("\nReverse the ArrayList : ");
        Collections.reverse(arrayList);
        System.out.print(arrayList);


//        Sort the elements of ArrayList.
        System.out.print("\nSorted ArrayList : ");
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
