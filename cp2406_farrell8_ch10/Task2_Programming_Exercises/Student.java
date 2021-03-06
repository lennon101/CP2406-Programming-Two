/**
 * Created by danelennon on 5/09/2016.
 */
public class Student {
    private String grade;
    private String name;
    private int age;

    public Student(String grade, String name, int age) {
        this.grade = grade;
        this.name = name;
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
