/**
 * Created by danelennon on 12/09/2016.
 */
public class Undergrad extends Student {
    public Undergrad(int id, String lastName) {
        super(id, lastName);
    }

    @Override
    public void setTuition() {
        tuition = 4000;
    }
}
