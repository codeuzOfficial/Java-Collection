package code_uz._collection_006_Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * COLLECTIONS
 * _006_Lesson
 */
public class Main {


    public static void main(String[] args) {
        //  LinkedList

        ArrayList<String> testArrayList = new ArrayList<>();
        //LinkedList<String> testArrayList = new LinkedList<>();

        testArrayList.add("str5");
        testArrayList.add("str6");

        /*******/
        LinkedList<String> list = new LinkedList<>();
//        LinkedList<String> list = new LinkedList<>(testArrayList);

        list.add("str1");
        list.add("str2");
        list.add("str3");


//        list.add(1, "str4");
//
//        list.addAll(testArrayList);
//        list.addAll(1, testArrayList);
//
//        list.addFirst("str5"); // new
//        list.addLast("str6"); // new


//
//        //  list.clear();
//
//        list.remove("str1");
//        list.remove(1);
//        list.removeAll(testArrayList);
//
//        list.removeFirst(); // new
        //   list.removeLast(); // new

/// /
//        System.out.println(list.contains("str1"));
//        System.out.println(list.containsAll(testArrayList));
//
//        System.out.println(list.indexOf("str1"));
//        System.out.println(list.lastIndexOf("str1"));
//
//        System.out.println(list.get(0));
//        System.out.println(list.set(0, "HELLO"));
//
//        System.out.println(list.getFirst()); // new
//        System.out.println(list.getLast()); // new
//
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//
//        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(list);

    }
}
