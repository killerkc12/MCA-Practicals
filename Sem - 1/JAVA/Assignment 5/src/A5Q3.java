import java.util.TreeSet;

public class A5Q3 {
    public static void main(String[] args) {

//        Create TreeSet with String elements.
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("TreeSet Created!");

//        Insert the elements in TreeSet.
        treeSet.add("kiran");
        treeSet.add("kedar");
        treeSet.add("manish");
        treeSet.add("akshay");
        treeSet.add("suresh");
        System.out.println("Element Inseted!");

//        Traverse through TreeSet.
        System.out.print("Transerve throuh TreeSet : ");
        for (String tree : treeSet){
            System.out.print(tree+" ");
        }

//        Remove the specified element from TreeSet.
        treeSet.remove("manish");
        System.out.println("\n TreeSet After removed Manish");
        System.out.println(treeSet);

    }
}
