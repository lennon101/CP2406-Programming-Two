/**
 * Created by danelennon on 12/09/2016.
 */
public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String name, int acctNum, String state) {
        super(name, acctNum);
        this.state = state;
    }

    @Override
    void display() {
        System.out.println(name + " (acct number: " + acctNum + ") resides in: " + state);
    }
}
