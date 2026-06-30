package june.collection;

/*Problem Statement

        A training center wants to maintain a list of learners.

        Perform the following operations using ArrayList (List Interface):

        Add 5 learner names.
        Display all learners.
        Search a learner.
        Update a learner name.
        Remove a learner.
        Display total learners.
        Sort learner names.
        Reverse learner names.
        Display first and last learner.
        Check whether the list is empty.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseStudy11 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Sumit");
        l1.add("Ajit");
        l1.add("Sujal");
        l1.add("Kishore");
        l1.add("Kshitij");
        System.out.println("All learners : "+l1);
        if (l1.contains("Ajit")) {
            System.out.println("Ajit present");
        }
        l1.set(2,"Nishant");
        System.out.println("After Update : "+l1);
        l1.remove("Kishore");
        System.out.println("After Remove : "+l1);
        System.out.println("All learners : "+l1.size());
        Collections.sort(l1);
        System.out.println("All sorted learners : "+l1);
        Collections.reverse(l1);
        System.out.println("Reverse Learners: "+l1);
        System.out.println("First Learner : "+l1.getFirst());
        System.out.println("Last Learner : "+l1.getLast());
        System.out.println("Is List empty : "+l1.isEmpty());
    }
}
