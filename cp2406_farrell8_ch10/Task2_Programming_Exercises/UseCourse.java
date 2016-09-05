import java.util.Scanner;

/**
 * Created by danelennon on 5/09/2016.
 */
public class UseCourse {
    private enum labCourses {BIO,CHM,CIS,PHY}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Department (BIO,CHM,CIS,PHY,ENG,IT): ");
        String dep = input.next();
        System.out.print("Enter a course number: ");
        int courseNum = input.nextInt();
        System.out.print("Enter credit hours: ");
        int credit = input.nextInt();
        boolean foundLabCourse = false;

        CollegeCourse course1 = null;

        for (labCourses course:labCourses.values()) {
            if (dep.equals(course.toString())){
                foundLabCourse = true;
                course1 = new LabCourse(dep,courseNum,credit);
            }
        }
        if (!foundLabCourse){
            course1 = new CollegeCourse(dep,courseNum,credit);
        }

        System.out.println(course1.display());;
    }
}
