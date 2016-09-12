/**
 * Created by danelennon on 12/09/2016.
 */
public class InternationalDivision extends Division {
    private String country;
    private String lang;

    public InternationalDivision(String name, int acctNum, String country, String lang) {
        super(name, acctNum);
        this.country = country;
        this.lang = lang;
    }

    @Override
    void display() {
        System.out.println(name + " (acct number: " + acctNum + ") is in " + country + " where they speak " + lang);
    }
}
