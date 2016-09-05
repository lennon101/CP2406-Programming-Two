/**
 * Created by danelennon on 5/09/2016.
 */
public class CollegeCourse {
    private String department;
    private int courseNum;
    private int credit;
    protected double fee;

    public CollegeCourse(String department, int courseNum, int credit) {
        this.department = department;
        this.courseNum = courseNum;
        this.credit = credit;
        this.fee = 120 * this.credit;
    }

    public String display() {
        return "CollegeCourse{" +
                "department='" + department + '\'' +
                ", courseNum=" + courseNum +
                ", credit=" + credit +
                ", fee=" + fee +
                '}';
    }
}
