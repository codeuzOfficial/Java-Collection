package code_uz._collection_005_Lesson;

import java.util.*;

/**
 * COLLECTIONS
 * _005_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // ArrayList

//        ArrayList<String> arrayList = new ArrayList<>();
//        //   List<String> arrayList = new ArrayList<>();
//        // Collection<String> arrayList = new ArrayList<>();

//        //ArrayList<String> arrayList = new ArrayList<>(testArrayList);
//        // ArrayList<String> arrayList = new ArrayList<>(20);

//        // constructor
//        arrayList.add("str1");
//        arrayList.add("str2");
//        arrayList.add("str3");
//        arrayList.add("str1");
//        arrayList.add("str5");

//        arrayList.add(1, "str4");

//        ArrayList<String> testArrayList = new ArrayList<>();
//        testArrayList.add("str5");
//        testArrayList.add("str6");

//        arrayList.addAll(testArrayList);
//        arrayList.addAll(1, testArrayList);

//        //  arrayList.clear();

//        arrayList.remove("str1");
//        arrayList.remove(1);
//        //  arrayList.removeAll(testArrayList);


//        // System.out.println(arrayList.contains("str5"));
//        //  System.out.println(arrayList.containsAll(testArrayList));

//        System.out.println(arrayList.indexOf("str1"));
//        System.out.println(arrayList.lastIndexOf("str1"));
//        System.out.println(arrayList.get(0));
//        //System.out.println(arrayList.set(0, "HELLO"));
//        //  System.out.println(arrayList.isEmpty());
//        //  System.out.println(arrayList.size());

//        System.out.println(Arrays.toString(arrayList.toArray()));

        ArrayList<Student> arrayList = new ArrayList<>();

        Student st1 = new Student("st1");
        Student st2 = new Student("st2");
        Student st3 = new Student("st3");
        Student st4 = new Student("st4");

        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st1);
        arrayList.add(st1);
        arrayList.add(null);
        //  arrayList.add(new Student("st5"));

        // arrayList.remove(st1);
        // arrayList.remove(new Student("st1"));

        System.out.println(arrayList.get(0));

        System.out.println(arrayList);

    }
}
