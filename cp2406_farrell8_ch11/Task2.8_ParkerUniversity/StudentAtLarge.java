/**
 * Created by danelennon on 12/09/2016.
 */
public class StudentAtLarge extends Student {
    public StudentAtLarge(int id, String lastName) {
        super(id, lastName);
    }

    @Override
    public void setTuition() {
        tuition = 2000;
    }
}
