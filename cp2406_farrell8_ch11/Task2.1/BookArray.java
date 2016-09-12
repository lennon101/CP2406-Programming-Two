import java.util.Scanner;

/**
 * Created by danelennon on 12/09/2016.
 */
public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] bookArray = new Book[10];

        for (int i=0;i<bookArray.length;++i){
            char bookType = getBookType();
            if (bookType == 'n'){
                String title = getTitle();
                bookArray[i] = new NonFiction(title);
            }else if (bookType == 'f'){
                String title = getTitle();
                bookArray[i] = new Fiction(title);
            }else {
                System.out.println("incorrect choice");
                --i;
            }
        }
        displayArray(bookArray);
    }

    private static void displayArray(Book[] a) {
        for (int i=0; i<a.length;++i){
            System.out.println(a[i]);
        }
    }

    public static char getBookType() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter \'n\' for NonFiction or \'f\' for fiction: ");
        return input.next().charAt(0);
    }

    public static String getTitle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter title for this book: ");
        return input.next();
    }
}
