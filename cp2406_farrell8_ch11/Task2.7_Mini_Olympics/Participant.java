/**
 * Created by danelennon on 12/09/2016.
 */
public class Participant {
    String name;
    int age;
    String address;

    public Participant(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "{Participant: " + name + "; " + age + "; " + address;
    }

    public boolean equals(Participant p) {
        if (p.name == this.name && p.age == this.age && p.address == this.address){
            return true;
        }
        return false;
    }
}
