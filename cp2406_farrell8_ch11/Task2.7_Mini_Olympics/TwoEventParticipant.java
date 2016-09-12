import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by danelennon on 12/09/2016.
 */
public class TwoEventParticipant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Participant[] marathon = new Participant[8];
        Participant[] diving = new Participant[8];

        Vector<Participant> participants = new Vector<>();

        participants.add(new Participant("dane", 27, "lol"));
        participants.add(new Participant("scott", 23, "lol2"));
        participants.add(new Participant("ben", 22, "lol3"));
        participants.add(new Participant("shane", 10, "meh"));
        participants.add(new Participant("tim", 21, "meh2"));
        participants.add(new Participant("kyle", 19, "meh3"));
        participants.add(new Participant("jack", 23, "meh5"));
        participants.add(new Participant("jake", 26, "meh6"));
        participants.add(new Participant("mick", 21, "meh21"));
        participants.add(new Participant("stu", 27, "meh23"));
        participants.add(new Participant("steph", 17, "meh32"));
        participants.add(new Participant("amy", 19, "meh765"));
        participants.add(new Participant("sam", 16, "meh134"));
        participants.add(new Participant("cole", 13, "meh52"));
        participants.add(new Participant("luke", 14, "meh63"));
        participants.add(new Participant("alice", 16, "meh754"));


        Collections.shuffle(participants);

        for (int i = 0; i < marathon.length; ++i) {
            marathon[i] = participants.get(i);
            Collections.shuffle(participants);
            diving[i] = participants.get(i);
        }

        for (int i = 0; i < marathon.length; ++i) {
            System.out.println("mara:" + marathon[i] + "\t\t\tdiving: " + diving[i]);
        }
        System.out.println();

        for (int i = 0; i < marathon.length; ++i) {
            for (int j = 0; j < diving.length; ++j) {
                if (marathon[i].equals(diving[j])) {
                    System.out.println(marathon[i].name + " is competing in both events");
                }
            }

        }
    }
}
