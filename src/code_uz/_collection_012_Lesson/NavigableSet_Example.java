package code_uz._collection_012_Lesson;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_Example {
    public static void main(String[] args) {
        Collection<Integer> integerCollection = new LinkedList<>();
        integerCollection.add(70);
        integerCollection.add(90);


        NavigableSet<Integer> navigableSet = new TreeSet<>();
        // in default constructor: elements will be inserted according to default natural sorting order (odatiy tartiblash tartibi)
        // number -> ascending order (increasing) (o'sish tartibida)
        // String -> alphabetical order (alifbo tartibida)



     /*
     // Elements will be inserted according to customized sorting order (tayyorlangan tartiblash tartibi)
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer num1 = (Integer) o1;
                Integer num2 = (Integer) o2;
                return num1.compareTo(num2);
            }
        };

        NavigableSet<Integer> navigableSet = new TreeSet<>(comparator);
 */

//        NavigableSet<Integer> navigableSet = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });

        //  NavigableSet<Integer> navigableSet = new TreeSet<>(integerCollection);

        // methods
        navigableSet.add(40);
        navigableSet.add(50);

        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.addAll(integerCollection);

        //  navigableSet.remove(10);
        //  navigableSet.removeAll(integerCollection);

        //  navigableSet.clear();
        //  navigableSet.retainAll(integerCollection);

//        System.out.println(" .isEmpty() : " + navigableSet.isEmpty());
//        System.out.println(" .size() : " + navigableSet.size());
//        System.out.println(" .contains(obj) : " + navigableSet.contains(20));
//        System.out.println(" .containsAll(c) : " + navigableSet.containsAll(integerCollection));
//        System.out.println(" .toArray() : " + navigableSet.toArray());


        // SortedSet (I)
//        System.out.println(" .first()    : " + navigableSet.first());
//        System.out.println(" .last()     : " + navigableSet.last());
//        System.out.println(" .headSet(str3) : " + navigableSet.headSet(30) + "   [...] < 30 ");
//        System.out.println(" .tailSet(str3) : " + navigableSet.tailSet(30) + "  [...] >= 30 ");
//        System.out.println(" .subSet(str2, str6) : " + navigableSet.subSet(20, 40) + "  [...] >= 20 &&  [...] <40 ");
//        System.out.println(" .comparator() :  " + navigableSet.comparator());


        // NavigableSet (I)
        System.out.println("NavigableSet");
        System.out.println(" .floor()    : " + navigableSet.floor(10));
        System.out.println(" .lower()    : " + navigableSet.lower(10));
        System.out.println(" .ceiling()    : " + navigableSet.ceiling(90));
        System.out.println(" .higher()     : " + navigableSet.higher(90));
        System.out.println(" .pollFirst()   : " + navigableSet.pollFirst());
        System.out.println(" .pollLast()   : " + navigableSet.pollLast());
        System.out.println(" .descendingSet() : " + navigableSet.descendingSet());


        System.out.println(" All elements: " + navigableSet);


        //  NavigableSet<Student> navigableSet = new TreeSet<>();
/*

//        NavigableSet<Student> navigableSet = new TreeSet<>(new Comparator<Student>() {
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

        navigableSet.add(st1);
        navigableSet.add(st2);
        navigableSet.add(st3);
        navigableSet.add(st4);


        navigableSet.add(new Student("b", 5));
        navigableSet.add(new Student("e", 16));


        System.out.println(navigableSet);
*/
    }
}
