package code_uz._collection_014_Lesson;

import java.util.*;

/**
 * COLLECTIONS
 * _014_Lesson
 */
public class Main {

    public static void main(String[] args) {

/*
        Collection<String> stringCollection = new LinkedList<>();
        stringCollection.add("str6");
        stringCollection.add("str7");
        stringCollection.add("str8");


        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("str1");
        priorityQueue.offer("str2");
        priorityQueue.offer("str3");
        priorityQueue.offer("str4");

        priorityQueue.add("str5");
*/

        //  priorityQueue.addAll(stringCollection);

        // priorityQueue.remove("str1");
        // priorityQueue.removeAll(stringCollection);

        // priorityQueue.clear();

        // priorityQueue.retainAll(stringCollection);


        //   System.out.println(priorityQueue.isEmpty());
        //   System.out.println(priorityQueue.size());

        // System.out.println(priorityQueue.contains("str1"));
        // System.out.println(priorityQueue.containsAll(stringCollection));


        // Queue (I)
        //  System.out.println("remove and get ->  .poll() " + priorityQueue.poll());
        //  System.out.println("remove and get ->  .remove() " + priorityQueue.remove());
        //  System.out.println(" get ->  .peek() " + priorityQueue.peek());
        //  System.out.println(" get ->  .element() " + priorityQueue.element());


        // System.out.println(priorityQueue);


//        Collection<Student> studentCollection = new LinkedList<>();
//        studentCollection.add(new Student("a", 12));
//        studentCollection.add(new Student("a", 9));
//        studentCollection.add(new Student("b", 1));
//        studentCollection.add(new Student("b", 5));

        // INITIAL_CAPACITY = 11
        // PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        //   PriorityQueue<Student> priorityQueue = new PriorityQueue<>(14);
/*
        Comparator comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getNickName().compareTo(o2.getNickName());
                if (result == 0) {
                    return o1.getId() - o2.getId();
                }
                return result;
            }
        };

          PriorityQueue<Student> priorityQueue = new PriorityQueue<>(14, comparator);
*/
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();


        priorityQueue.offer(new Student("c", 7));
        priorityQueue.offer(new Student("d", 8));
        priorityQueue.offer(new Student("e", 50));
        priorityQueue.offer(new Student("e", 31));

        priorityQueue.offer(new Student("a", 12));
        priorityQueue.offer(new Student("a", 9));
        priorityQueue.offer(new Student("b", 1));
        priorityQueue.offer(new Student("b", 5));

        // priorityQueue.addAll(studentCollection);


        // Not guaranteed to be in priorty order

        /*
        //  System.out.println(priorityQueue);

        for (Student student : priorityQueue) {
            System.out.println(student);
        }
        */


        // Correct order, but removes from the Priority Queue

        while (!priorityQueue.isEmpty()) {
            //    System.out.println(priorityQueue.poll());
            System.out.println(priorityQueue.remove());
        }


    }
}
