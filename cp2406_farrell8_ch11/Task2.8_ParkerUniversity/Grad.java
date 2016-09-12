/**
 * Created by danelennon on 12/09/2016.
 */
public class Grad extends Student {
    public Grad(int id, String lastName) {
        super(id, lastName);
    }

    @Override
    public void setTuition() {
        tuition = 6000;
    }
}
