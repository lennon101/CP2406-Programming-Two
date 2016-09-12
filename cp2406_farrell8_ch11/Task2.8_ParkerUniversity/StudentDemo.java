/**
 * Created by danelennon on 12/09/2016.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[6];

        students[1] = new Undergrad(1,"dane");
        students[2] = new Undergrad(2,"kyle");
        students[3] = new Grad(3,"jack");
        students[4] = new Grad(4,"jake");
        students[5] = new StudentAtLarge(5,"steph");
        students[0] = new StudentAtLarge(7,"luke");

        for (int i = 0; i<students.length;++i){
            System.out.println(students[i].getLastName() + "'s tuition fee is: " + students[i].getTuition());
        }
    }
}
