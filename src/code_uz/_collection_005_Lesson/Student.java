package code_uz._collection_005_Lesson;


public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "name='" + name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;

        return this.name.equals(s.name);
    }
}
