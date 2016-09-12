/**
 * Created by danelennon on 12/09/2016.
 */
public class UseBook {

    public static void main(String[] args) {
        Fiction lordOfTheRings = new Fiction("Lord of The Rings");
        NonFiction travelAustralia = new NonFiction("Travel Australia");

        System.out.println(lordOfTheRings.title + "'s price is: " + lordOfTheRings.price);
        System.out.println(travelAustralia.title + "'s price is: " + travelAustralia.price);
    }

}
