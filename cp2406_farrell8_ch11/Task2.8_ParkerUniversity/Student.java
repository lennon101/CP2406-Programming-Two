/**
 * Created by danelennon on 12/09/2016.
 */
public abstract class Student {
    private int id;
    private String lastName;
    public int tuition;

    public Student(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
        setTuition();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTuition() {
        return tuition;
    }

    abstract public void setTuition();
}
