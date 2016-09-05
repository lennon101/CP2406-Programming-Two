/**
 * Created by danelennon on 5/09/2016.
 */
public class RaceHorse extends Horse{
    private int numRaces;

    public RaceHorse(String name, String colour, int birthYear, int numRaces) {
        super(name, colour, birthYear);
        this.numRaces = numRaces;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }
}
