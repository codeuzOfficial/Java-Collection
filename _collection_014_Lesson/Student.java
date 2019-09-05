package code_uz._collection_014_Lesson;

/**
 * Created by BigMan on 26.07.2018.
 */
public class Student implements Comparable<Student> {

    private String nickName;
    private Integer id;


    public Student(String nickName, Integer id) {
        this.nickName = nickName;
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.nickName.compareTo(o.nickName);
        if (result == 0) {
            return o.id - this.id;
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", id=" + id +
                '}';
    }
}
