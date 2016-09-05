import java.util.Scanner;

/**
 * Created by danelennon on 5/09/2016.
 */
public class DemoBaseBallGames {

    public static void main(String[] args) {

        testBaseBallGame();
        testHSBaseBallGame();
        testLittleLeagueGame();

    }

    private static void testLittleLeagueGame() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name for team 1: ");
        String name1 = input.next();
        System.out.print("Enter a name for team 2: ");
        String name2 = input.next();
        BaseBallGame bg = new LittleLeagueBaseBallGame(name1,name2);
        System.out.println("The number of innings for this game is: " + bg.getNumInnings());

        char choice = 'x';
        while (choice != 'q'){
            choice = getChoice();
            if (choice == 'w'){
                System.out.println(bg.getWinner());
            }else if (choice == 'c'){
                System.out.print("who would you like to enter a score for (" + name1 + " or " + name2 + "): ");
                String name = input.next();
                System.out.print("What inning would you like enter for? :");
                int inning = input.nextInt();
                System.out.println("What was their score for this inning? :");
                int score = input.nextInt();

                if (bg.getTeam1Name().equals(name)) {
                    bg.setTeam1Score(score, inning);
                } else if (bg.getTeam2Name().equals(name)) {
                    bg.setTeam2Score(score, inning);
                } else {
                    System.out.println("there is no team under that name");
                }
            }
        }
    }

    private static void testHSBaseBallGame() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name for team 1: ");
        String name1 = input.next();
        System.out.print("Enter a name for team 2: ");
        String name2 = input.next();
        BaseBallGame bg = new HighSchoolBaseBallGame(name1,name2);
        System.out.println("The number of innings for this game is: " + bg.getNumInnings());

        char choice = 'x';
        while (choice != 'q'){
            choice = getChoice();
            if (choice == 'w'){
                System.out.println(bg.getWinner());
            }else if (choice == 'c'){
                System.out.print("who would you like to enter a score for (" + name1 + " or " + name2 + "): ");
                String name = input.next();
                System.out.print("What inning would you like enter for? :");
                int inning = input.nextInt();
                System.out.println("What was their score for this inning? :");
                int score = input.nextInt();

                if (bg.getTeam1Name().equals(name)) {
                    bg.setTeam1Score(score, inning);
                } else if (bg.getTeam2Name().equals(name)) {
                    bg.setTeam2Score(score, inning);
                } else {
                    System.out.println("there is no team under that name");
                }
            }
        }
    }

    private static void testBaseBallGame() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name for team 1: ");
        String name1 = input.next();
        System.out.print("Enter a name for team 2: ");
        String name2 = input.next();
        BaseBallGame bg = new BaseBallGame(name1,name2);
        System.out.println("The number of innings for this game is: " + bg.getNumInnings());

        char choice = 'x';
        while (choice != 'q'){
            choice = getChoice();
            if (choice == 'w'){
                System.out.println(bg.getWinner());
            }else if (choice == 'c'){
                System.out.print("who would you like to enter a score for (" + name1 + " or " + name2 + "): ");
                String name = input.next();
                System.out.print("What inning would you like enter for? :");
                int inning = input.nextInt();
                System.out.println("What was their score for this inning? :");
                int score = input.nextInt();

                if (bg.getTeam1Name().equals(name)) {
                    bg.setTeam1Score(score, inning);
                } else if (bg.getTeam2Name().equals(name)) {
                    bg.setTeam2Score(score, inning);
                } else {
                    System.out.println("there is no team under that name");
                }
            }
        }
    }

    private static char getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter q to quit or w to get the winner c to continue");
        return input.next().charAt(0);
    }
}
