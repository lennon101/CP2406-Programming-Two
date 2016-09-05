/**
 * Created by danelennon on 5/09/2016.
 */
public class Horses {
    public static void main(String[] args) {
        Horse mare = new Horse("sandy","brown",1989);
        RaceHorse raceHorse = new RaceHorse("Gonna-Be-A-Winna","pitch-black",1995,5);

        System.out.println("My horses name is: " + mare.getName());
        System.out.println("And she was bron in: " + mare.getBirthYear());

        System.out.println("Our Race Horses name is: " + raceHorse.getName());
        System.out.println("And she was bron in: " + raceHorse.getBirthYear());
        System.out.println("She has been in: " + raceHorse.getNumRaces() + " races");
    }
}
