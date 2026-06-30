package java8Features;

/*
* The Stream API was introduced in Java 8
* ----Filter the data
* sort the data
* search the data
* Transform the data
* can perform the aggregate operations also
*
*--------------------------------------
* why----------?
* -- with the help of stream API -- we can process collection in a very simple & efficient way
* ----- A "Stream" is a sequence of elements
* ----------Collection ---------- Stream() --------Operation ----result
* -----------------------------------------
*
* Before Java 8
* for(Integer i: list)
* {
*  if(i> 50)
*   {
*      System.out.println(i);
*    }
* }
* ----------------------------------
* After java 8 code
* list.stream().filter.forEach(System.out::println);
* -------------------------------------------------
*
* Syntax:
*  collection.stream()
*             .operation()
*              .operation()
*              .terminalOperation();
*
* list.stream()
*       .filter(x->x>50)
*       . forEach(System.out::println);
*
*
* -------------------------------------------
* --- Stream API was introduced in java 8.
* ---- Streams do not store data. they process data from collections.
* ----Streams cannot modify the  original collection.
*
*    Stream s = list.stream();
*     s.forEach(System.out::println); -- wrong
*     s. forEach(System.out:: println);
*
* --- Stream supports functional programming.
* ---- Streams supports Methods References.
* ---- filter(), map(), sorted(), distinct(), limit()
* -------produce the result
*     forEach(), count(), collect(), reduce()
* -------Streams can process large data efficiently.
* Streams work mainly with collections.
* ----- support the method chaining
* stream().filter().sorted().forEach();
* ---Streams reduce loop usage.
*
*
* */

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
     l1.add("Rahul");
     l1.add("Ram");
     l1.add("Raju");
     l1.add("Jagannath");
     l1.add("Shankar");

        System.out.println(l1);
    }
}
