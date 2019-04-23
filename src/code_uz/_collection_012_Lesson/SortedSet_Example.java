package code_uz._collection_012_Lesson;

import java.util.*;

/**
 * COLLECTIONS
 * _012_Lesson
 */
public class SortedSet_Example {

    public static void main(String[] args) {
        Collection<String> stringCollection = new Vector<>();
        stringCollection.add("f");
        stringCollection.add("g");


        //  SortedSet<String> sortedSet = new TreeSet<>();
        // in default constructor: elements will be inserted according to default natural sorting order (tabiy tartiblash tartibi)
        // number -> ascending order (increasing) (o'sish tartibida)
        // String -> alphabetical order (alifbo tartibida)


        // Elements will be inserted according to customized sorting order (tayyorlangan tartiblash tartibi)
/*
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                String num1 = (String) o1;
//                String num2 = (String) o2;
//                return num2.compareTo(num1);
//            }
//        };

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String num1 = o1;
                String num2 = o2;
                return num2.compareTo(num1);
            }
        };

        SortedSet<String> sortedSet = new TreeSet<>(comparator);
*/
/*
        SortedSet<String> sortedSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String st1, String st2) {
                return st1.compareTo(st2);
            }
        });
 */
        //   SortedSet<String> sortedSet = new TreeSet<>(stringCollection);


//        sortedSet.add("a");
//        sortedSet.add("b");
//
//        sortedSet.add("c");
//        sortedSet.add("d");
//        sortedSet.add("e");

        // navigableSet.addAll(integerCollection);

        //  navigableSet.remove(10);
        //  navigableSet.removeAll(integerCollection);

        //  navigableSet.clear();
        //  navigableSet.retainAll(integerCollection);

//        System.out.println(" .isEmpty() : " + sortedSet.isEmpty());
//        System.out.println(" .size() : " + sortedSet.size());
//        System.out.println(" .contains(obj) : " + sortedSet.contains("str3"));
//        System.out.println(" .containsAll(c) : " + sortedSet.containsAll(stringCollection));
//        System.out.println(" .toArray() : " + sortedSet.toArray());


        // SortedSet (I)
//        System.out.println(" .first()    : " + sortedSet.first());
//        System.out.println(" .last()     : " + sortedSet.last());
//        System.out.println(" .headSet(str3) : " + sortedSet.headSet("b") + "   [...] < b ");
//        System.out.println(" .tailSet(str3) : " + sortedSet.tailSet("b") + "  [...] >= b ");
//        System.out.println(" .subSet(str2, str6) : " + sortedSet.subSet("b", "e") + "[...] >=b &&  [...] <e ");
//        System.out.println(" .comparator() :  " + sortedSet.comparator());

        // System.out.println(" All elements: " + sortedSet);


         SortedSet<Student> sortedSet = new TreeSet<>();

//        SortedSet<Student> sortedSet = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o1.getNickName().compareTo(o2.getNickName());
//                if (result == 0) {
//                    return o1.getId() - o2.getId();
//                }
//                return result;
//            }
//        });


        Student st1 = new Student("a", 15);
        Student st2 = new Student("b", 12);
        Student st3 = new Student("a", 31);
        Student st4 = new Student("b", 44);

        sortedSet.add(st1);
        sortedSet.add(st2);
        sortedSet.add(st3);
        sortedSet.add(st4);


        sortedSet.add(new Student("b", 5));
        sortedSet.add(new Student("e", 16));


        System.out.println(sortedSet);

    }
}
