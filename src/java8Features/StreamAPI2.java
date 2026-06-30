package java8Features;

import java.util.ArrayList;

public class StreamAPI2 {
    static void main(String[] args) {
        ArrayList<Integer> m1 = new ArrayList<>();
        m1.add(45);
        m1.add(545);
        m1.add(435);
        m1.add(245);
        m1.add(5);
        m1.add(995);
        m1.add(45);
        m1.add(333);
        System.out.println("Original Marks");
        System.out.println(m1);

        m1.stream()
                .filter(m->m>=540)
                .forEach(System.out::println);
        System.out.println("\nUnique Marks");


        m1.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("\nSorted Marks");

        m1.stream()
                .sorted()
                .forEach(System.out::println);

        long count = m1.stream()
                .filter(m->m>=40)
                .count();
        System.out.println("\nQualified Count : "+count);
    }
}
