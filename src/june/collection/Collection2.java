package june.collection;
import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        Vector<String> l1 = new Vector<>();
        l1.add("Sumit");
        l1.add("Amit");
        l1.add("Sujal");
        System.out.println("List of all learners: " + l1);
        l1.addElement("Rohit");
        System.out.println("After adding element: " + l1);
        System.out.println("index 2 learner: " + l1.get(2));
        System.out.println("Can Set at index 3: " + l1.set(3, "Arun"));
        System.out.println("if learner is there or not: " + l1.contains("Sonam"));
        System.out.println("Size: " + l1.size());
        System.out.println("First element: " + l1.firstElement());
        System.out.println("last element: " + l1.lastElement());

    }
}
