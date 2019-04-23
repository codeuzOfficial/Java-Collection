package code_uz._collection_004_Lesson;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * COLLECTIONS
 * _004_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // ArrayList

        ArrayList<String> testArrayList = new ArrayList<>();
        testArrayList.add("str44");
        testArrayList.add("str3");


        ArrayList<String> arrayList = new ArrayList<>();
        //ArrayList<String> arrayList = new ArrayList<>(testArrayList);
        // ArrayList<String> arrayList = new ArrayList<>(20);

        // constructor
        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        arrayList.add("str1");
        arrayList.add("str5");


        //  arrayList.add(1, "str4");

//        ArrayList<String> testArrayList = new ArrayList<>();
//        testArrayList.add("str5");
//        testArrayList.add("str6");

        // arrayList.addAll(testArrayList);
        // arrayList.addAll(1, testArrayList);

        //   arrayList.clear();

        // arrayList.remove("str1");
        // arrayList.remove(1);
        //  arrayList.removeAll(testArrayList);


        // System.out.println(arrayList.contains("str5"));
        //  System.out.println(arrayList.containsAll(testArrayList));

        //System.out.println(arrayList.indexOf("str1"));
        // System.out.println(arrayList.lastIndexOf("str1"));
        //  System.out.println(arrayList.get(0));
        //System.out.println(arrayList.set(0, "HELLO"));
        //  System.out.println(arrayList.isEmpty());
        //  System.out.println(arrayList.size());

        System.out.println(Arrays.toString(arrayList.toArray()));


    }
}
