/**
 * Created by danelennon on 12/09/2016.
 */
public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    void setPrice() {
        this.price = 24.99;
    }

    @Override
    public String toString() {
        return "Fiction: " + title + " costs " + price;
    }
}
