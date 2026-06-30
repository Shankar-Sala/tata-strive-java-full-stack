package june.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<String>();
        s1.add("Java");
        s1.add("React");
        s1.add("Cyber");
        s1.add("HTML");
        s1.add("BootStrap");
        s1.add("CSS");
        s1.add("Code Foundation");
        s1.add("HTML");
        System.out.println("Set : " + s1);
        System.out.println("Size : " + s1.size());
        System.out.println("Contains Java? : " + s1.contains("Java"));
        System.out.println("Is empty? : " + s1.isEmpty());
        s1.remove("React");
        System.out.println("After Removed : " + s1);
        //Iterator()
        Iterator<String> itr = s1.iterator();
        System.out.println("Using Iterator : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}