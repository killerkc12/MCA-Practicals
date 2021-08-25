import java.util.LinkedList;

public class A5Q2 {
    public static void main(String[] args) {
//    Create LinkedList of String elements.
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("LinkedList Created");
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");

//        Iterate through the LinkedList.
        System.out.println("LinkedList Iteration : ");
        for (String list : linkedList){
            System.out.print(list+" ");
        }

//        Insert element at specified position.
        linkedList.add(3,"nine");
        System.out.println("\nelement nine inserted at position 3");
        linkedList.add(0,"ten");
        System.out.println("element ten inserted at position 0");

        System.out.println("LinkedList after insert Element at specific piston : ");
        System.out.println(linkedList);

//        Remove element from specified position.
        linkedList.remove("three");

        System.out.println("LinkedList after Remove element from specified position. : ");
        System.out.println(linkedList);

    }
}
