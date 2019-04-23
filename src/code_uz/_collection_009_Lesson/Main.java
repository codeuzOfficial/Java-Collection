package code_uz._collection_009_Lesson;

import java.util.*;

/**
 * COLLECTIONS
 * _009_Lesson
 */
public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("str4");
        stringList.add("str5");

        Set<String> set = new LinkedHashSet<>();
//        Set<String> set = new LinkedHashSet<>(30);
//        Set<String> set = new LinkedHashSet<String>(30, new Float(0.2));
//        Set<String> set = new LinkedHashSet<>(stringList);

        // HashSet<String> set = new HashSet<>();

        set.add("str1");
        set.add("str2");
        set.add("str3");

        // set.add(null);


        //  System.out.println(set.add("str1"));

        //  set.addAll(stringList);

        //  set.remove("str1");
        //  System.out.println(set.remove("str1"));
        // set.removeAll(stringList);

        // set.clear();

        // set.retainAll(stringList);

        // System.out.println(set.isEmpty());
        //  System.out.println(set.size());

        // System.out.println(set.contains("str1"));
        //  System.out.println(set.containsAll(stringList));


        // for getting elements

//        for (String str : set) {
//            System.out.println(str);
//        }


        //  System.out.println(set);


        Set<Student> studentSet = new LinkedHashSet<>();

        studentSet.add(new Student("str1")); // 456
        // studentSet.add(new Student("str1")); // 678
        studentSet.add(new Student("str2"));

        Student st1 = new Student("str3"); // 123
        //Student st2 = new Student("str3");

        studentSet.add(st1); // 123
        //  studentSet.add(st1); // 123
//        studentSet.add(st2);

        //      System.out.println(st1.hashCode());
        //      System.out.println(st2.hashCode());

        System.out.println(studentSet.contains(new Student("str3")));

        System.out.println(studentSet);


    }
}
