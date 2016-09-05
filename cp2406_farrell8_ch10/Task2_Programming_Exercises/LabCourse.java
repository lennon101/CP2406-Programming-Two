/**
 * Created by danelennon on 5/09/2016.
 */
public class LabCourse extends CollegeCourse{

    public LabCourse(String department, int courseNum, int credit) {
        super(department, courseNum, credit);
        this.fee += 50;
    }

    @Override
    public String display() {
        return "This is a lab course \n" + super.display();
    }
}
