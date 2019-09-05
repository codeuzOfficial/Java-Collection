package code_uz._collection_012_Lesson;

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
