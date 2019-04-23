package code_uz._collection_007_Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * COLLECTIONS
 * _007_Lesson
 */
public class Main {


    public static void main(String[] args) {
        //  Vector

        ArrayList<String> testArrayList = new ArrayList<>();
        testArrayList.add("str5");
        testArrayList.add("str6");

        /*******/

        Vector<String> vector = new Vector<>();
        // Vector<String> vector = new Vector(15);

        //Vector<String> vector = new Vector(15, 5);
        // Vector<String> vector = new Vector(testArrayList);

        vector.add("str1");
        vector.add("str2");
        vector.add("str3");

        vector.add(1, "str4");

        vector.addElement("str5"); // new

        vector.addAll(testArrayList);
        vector.addAll(1, testArrayList);


        vector.clear();

        vector.remove("str1");
        vector.remove(1);
        vector.removeAll(testArrayList);

        vector.removeElement("str1"); //new
        vector.removeElementAt(1); // new
        vector.removeAllElements(); // new


        System.out.println(vector.contains("str1"));
        System.out.println(vector.containsAll(testArrayList));

        System.out.println(vector.indexOf("str1"));
        System.out.println(vector.lastIndexOf("str1"));

        System.out.println(vector.get(0));
        System.out.println(vector.set(0, "HELLO"));

        System.out.println(vector.elementAt(1)); //new
        System.out.println(vector.firstElement()); // new
        System.out.println(vector.lastElement());// new


        System.out.println(vector.isEmpty());
        System.out.println(vector.size());

        System.out.println(vector.capacity()); //new

        System.out.println(Arrays.toString(vector.toArray()));

        System.out.println(vector);

    }
}
