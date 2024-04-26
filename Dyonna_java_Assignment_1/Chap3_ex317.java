
public class Chap3_ex317 {
    public static void main(String[] args) {
    }
}
 class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); 
        setPricePerItem(pricePerItem); 
    }

    // Setters
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber; 
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Getters
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
class InvoiceTest {
    public static void main(String[] args) {
        // Create an instance of Invoice
        Invoice invoice1 = new Invoice("123", "Hammer", 5, 10.0);

        // Display the invoice details
        System.out.println("Part number: " + invoice1.getPartNumber());
        System.out.println("Part description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: " + invoice1.getPricePerItem());
        System.out.println("Invoice amount: " + invoice1.getInvoiceAmount());
    }
}
