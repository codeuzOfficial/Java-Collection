package code_uz._collection_016_Lesson;


import java.util.LinkedList;
import java.util.List;


/**
 * COLLECTIONS
 * <p>
 * Cloneable_RandomAccess__Serializable
 * <p>
 * _016_Lesson
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Cloneable, RandomAccess, Serializable
/*
        Student student1 = new Student("Ali", 1);

        Student student2 = (Student) student1.clone();
        //    Student student2 = student1;

        // Student student2 = (Student) student1.clone();
        student2.setName("Vali");

        System.out.println(student1);
        System.out.println(student2);
*/

        /* **/
/*
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("str1");
        list1.add("str2");
        list1.add("str3");


        LinkedList<String> list2 = new LinkedList<>();
        list2 = (LinkedList<String>) list1.clone();

        list2.set(0, "str11");

        System.out.println(list1);
        System.out.println(list2);
*/


        LinkedList<Student> studentList1 = new LinkedList<>();
        studentList1.add(new Student("Ali", 1));
        studentList1.add(new Student("Vali", 2));

        LinkedList<Student> studentList2 = (LinkedList<Student>) studentList1.clone();


        //  studentList2.set(0, new Student("Bob", 22));

      //  Student student = studentList2.get(0);
      //  student.setName("Bob");

        System.out.println(studentList1);
        System.out.println(studentList2);

    }
}
