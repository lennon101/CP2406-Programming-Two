/**
 * Created by danelennon on 5/09/2016.
 */
public class ItemSold {
    private int invoiceNum;
    private String description;
    private float price;

    public ItemSold(int invoiceNum, String description, float price) {
        this.invoiceNum = invoiceNum;
        this.description = description;
        this.price = price;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
