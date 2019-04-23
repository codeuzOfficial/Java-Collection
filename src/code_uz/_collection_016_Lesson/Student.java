package code_uz._collection_016_Lesson;

/**
 * Created by BigMan on 02.08.2018.
 */
public class Student implements Cloneable {
    private String name;
    private Integer id;

    public Student() {
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
