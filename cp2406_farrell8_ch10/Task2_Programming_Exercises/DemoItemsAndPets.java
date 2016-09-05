/**
 * Created by danelennon on 5/09/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold(1001,"bucket",5.99f);
        PetSold puppy = new PetSold(1002,"little bundle of cuteness",259.99f,true,true,false);

        System.out.println(item1.getDescription() + " was sold for " + item1.getPrice());

        System.out.println("A " + puppy.getDescription() + " was sold for " + puppy.getPrice());
        System.out.println("The " + puppy.getDescription() + " Neutered status is: " + puppy.isNeutered() +
                "\nAnd it is " + puppy.isHousebroken() + " that the " + puppy.getDescription() +" is housebroken");
    }
}
