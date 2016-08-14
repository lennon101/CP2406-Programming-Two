import java.util.Scanner;

/**
 * Created by danelennon on 14/08/2016.
 */
public class MinuteConversion {
    public static void main(String[] args) {
        boolean valid = false;
        int numMinutes = 0;

        Scanner input = new Scanner(System.in);

        while (!valid) {
            System.out.print("Enter a value in nautical miles to convert: ");
            try {
                numMinutes = Integer.parseInt(input.next());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("invalid input, try again...");
            }
        }

        while (numMinutes<=0){
            System.out.println("invalid input, try again...");
            valid = false;
            while (!valid) {
                System.out.print("Enter a value in nautical miles to convert: ");
                try {
                    numMinutes = Integer.parseInt(input.next());
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("invalid input, try again...");
                    System.out.print("Enter a value in nautical miles to convert: ");
                }
            }
        }

        double numHours = numMinutes/60;
        double numDays = numHours/24;

        System.out.println(numMinutes + " minutes equats to: " + String.format("%.2f", numHours)  + " hrs OR " + String.format("%.2f", numDays) + " days");
    }
}
