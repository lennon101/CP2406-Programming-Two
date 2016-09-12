/**
 * Created by danelennon on 12/09/2016.
 */
public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    void setPrice() {
        this.price = 37.99;
    }

    @Override
    public String toString() {
        return "NonFiction: " + title + " costs " + price;
    }
}
