import javax.transaction.TransactionRequiredException;
import java.util.Vector;

/**
 * Created by danelennon on 5/09/2016.
 */
public class BaseBallGame {
    private String team1Name;
    private String team2Name;
    protected int numInnings = 2;

    private Vector<Integer> team1Score = new Vector<>();
    private Vector<Integer> team2Score = new Vector<>();

    public BaseBallGame(String team1Name, String team2Name) {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public int getTeam1Score(int i) {
        try {
            return team1Score.get(i);
        }catch (Throwable t){
            System.out.println("Team1 hasn't scored for this inning yet");
            return 0;
        }
    }

    public void setTeam1Score(int score,int inningNum) {
        if (inningNum > this.numInnings){
            System.out.println("Exceeded the allowable number of innings. " +
                    "\nAll innings scores have been entered");
        }else {
            if (inningNum == 1) {
                this.team1Score.add(score);
            } else if (this.team1Score.size() >= (inningNum - 1)) {
                this.team1Score.add(score);
            } else {
                System.out.println("Team1 hasn't scored for the previous inning yet");
            }
        }
    }

    public int getTeam2Score(int i) {
        try {
            return team2Score.get(i);
        }catch (Throwable t){
            System.out.println("Team1 hasn't scored for this inning yet");
            return 0;
        }
    }

    public void setTeam2Score(int score,int inningNum) {
        if (inningNum > this.numInnings){
            System.out.println("Exceeded the allowable number of innings. " +
                    "\nAll innings scores have been entered");
        }else {
            if (inningNum == 1) {
                this.team2Score.add(score);
            } else if (this.team2Score.size() >= (inningNum - 1)) {
                this.team2Score.add(score);
            } else {
                System.out.println("Team2 hasn't scored for the previous inning yet");
            }
        }
    }


    public String getWinner(){
        if (this.team1Score.size() >= numInnings && this.team2Score.size() >= numInnings){
            if (getTeam1TotalScore().equals(getTeam2TotalScore())){
                return "There has been a tie!";
            }else if (getTeam1TotalScore() > getTeam2TotalScore()){
                return "Team1 won";
            }else {
                return "Team2 won";
            }
        }else{
            return "Not all teams have enough scores in their innings yet";
        }
    }

    public Integer getTeam1TotalScore(){
        Integer totalScore = 0;
        for (Integer score:team1Score) {
            totalScore += score;
        }
        return totalScore;
    }

    public Integer getTeam2TotalScore(){
        Integer totalScore = 0;
        for (Integer score:team2Score) {
            totalScore += score;
        }
        return totalScore;
    }

    public int getNumInnings() {
        return numInnings;
    }
}
