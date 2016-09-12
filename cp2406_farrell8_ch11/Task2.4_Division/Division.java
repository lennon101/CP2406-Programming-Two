/**
 * Created by danelennon on 12/09/2016.
 */
public abstract class Division {
    String name;
    int acctNum;

    public Division(String name, int acctNum) {
        this.name = name;
        this.acctNum = acctNum;
    }

    abstract void display();

}
