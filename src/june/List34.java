package june;

import java.util.LinkedList;

public class List34 {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

        // add
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");

        System.out.println("1. After add() ---------- " + cars);

        // addFirst
        cars.addFirst("Maruti");
        System.out.println("2. After addFirst() ----- " + cars);

        // addLast
        cars.addLast("Mercedes");
        System.out.println("3. After addLast() ------ " + cars);

        // getFirst
        System.out.println("4. First Car ------------ " + cars.getFirst());

        // getLast
        System.out.println("5. Last Car ------------- " + cars.getLast());

        // remove by index
        System.out.println("6. Removed Car ---------- " + cars.remove(2));
        System.out.println("7. List After Remove ---- " + cars);

        // removeFirst
        cars.removeFirst();
        System.out.println("8. After removeFirst() ---------" + cars);

        // removeLast
        cars.removeLast();
        System.out.println("9. After removeLast() --- " + cars);
    }
}