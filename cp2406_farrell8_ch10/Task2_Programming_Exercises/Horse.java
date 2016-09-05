/**
 * Created by danelennon on 5/09/2016.
 */
public class Horse {
    private String name;
    private String colour;
    private int birthYear;

    public Horse(String name, String colour, int birthYear) {
        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
