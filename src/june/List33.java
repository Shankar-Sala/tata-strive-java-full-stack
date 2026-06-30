package june;
/*ArrayList
        |
        array
        |
        fast search

        linkedList
          |
          nodes
            |
            Fast Insert/Delete

            --------------------------------------------------
            Need Fast Retrieval
            |
            arraylist

            Need frequent Insert/ Delete?
            |
            Linkedlist


arraylist
linkedlist
* */


import java.util.LinkedList;

public class List33 {
    static void main()
    {
        LinkedList<String> l1 = new LinkedList<String>();

        //add
        l1.add("Meet");
        l1.add("raju");
        l1.add("Geeta");
        l1.add("Aman");
        l1.add("shankar");
        l1.add(null);
        System.out.println("1. add ------------------"+l1);
        //addFirst
        l1.addFirst("rahul");
        System.out.println("2. after addFirst-----------"+l1);

        //addLast
        l1.addLast("Sneha");
        System.out.println("3. after addlast--------------"+l1);

        //getFirst
        System.out.println("4. after getFirst---------------"+l1.getFirst());

        //remove
        System.out.println("5. After remove---------------------"+l1.remove(2));
        System.out.println(l1);
    }
}
