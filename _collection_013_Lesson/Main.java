package code_uz._collection_013_Lesson;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * COLLECTIONS
 * _013_Lesson
 */
public class Main {

    public static void main(String[] args) {

        Collection<String> stringCollection = new HashSet<>();
        stringCollection.add("str6");
        stringCollection.add("str7");
        stringCollection.add("str8");


        Queue<String> queue = new LinkedList<>();

//        queue.offer("str1");
//        queue.offer("str2");
//        queue.offer("str3");
//        queue.offer("str4");

//        queue.add("str5");

        //  queue.addAll(stringCollection);

        // queue.remove("str1");
        // queue.removeAll(stringCollection);

        // queue.clear();

        // queue.retainAll(stringCollection);


        //   System.out.println(queue.isEmpty());
        //   System.out.println(queue.size());

        // System.out.println(queue.contains("str1"));
        // System.out.println(queue.containsAll(stringCollection));


        // Queue (I)

        //  System.out.println("remove and get ->  .poll() " + queue.poll());
        //  System.out.println("remove and get ->  .remove() " + queue.remove());

        System.out.println(" get ->  .peek() " + queue.peek());
        //     System.out.println(" get ->  .element() " + queue.element());


        System.out.println(queue);


    }
}
