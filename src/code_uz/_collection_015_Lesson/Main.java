package code_uz._collection_015_Lesson;

import java.util.Collection;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/**
 * COLLECTIONS
 * _015_Lesson
 */
public class Main {

    public static void main(String[] args) {

        Collection<String> stringCollection = new TreeSet<>();
        stringCollection.add("str5");
        stringCollection.add("str6");
        stringCollection.add("str7");

        Stack<String> stringStack = new Stack<>();

        stringStack.add("str1");
        stringStack.add("str2");
        stringStack.add("str3");
        stringStack.add("str4");

        // Stack method
        stringStack.push("str10");
        stringStack.push("str11");

        // COLLECTION METHODS
//        stringStack.addAll(stringCollection);
//
//        stringStack.remove("str1");
//        stringStack.removeAll(stringCollection);
//
//        stringStack.clear();
//
//        stringStack.retainAll(stringCollection);
//
//        System.out.println(stringStack.isEmpty());
//        System.out.println(stringStack.size());
//
//        System.out.println(stringStack.contains("str1"));
//        System.out.println(stringStack.containsAll(stringCollection));


        // LIST METHODS
        // stringStack.add(1, "str20");
        // stringStack.addAll(2, stringCollection);
        // stringStack.remove(1);
        // stringStack.remove(stringStack.indexOf("str11"));
        // stringStack.lastIndexOf("str1");
        // stringStack.set(1, "str21");
        // stringStack.get(1);


        // Stack method
        // System.out.println(" .pop() :  " + stringStack.pop()); // oxirgi qo'shilgan obj (get and remove)
        // System.out.println(" .peek() :  " + stringStack.peek()); // oxirgi qo'shilgan obj (get)

        // System.out.println(" .empty() :  " + stringStack.empty());
        // System.out.println(" .search() : " + stringStack.search("str1")); // offset

        System.out.println("All ELEMENTS : " + stringStack);


    }
}
