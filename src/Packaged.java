
public class Packaged extends Product{
    private int itemQuantity;
    private String usebyDate;
    public Packaged(String itemName, int productID, int itemPrice, double taxPrice , int itemQuantity , String usebyDate) {
        super(itemName, productID, itemPrice, taxPrice);
        this.itemQuantity = itemQuantity;
        this.usebyDate= usebyDate;
    }

    public String toString() {
        return String.format("%s %s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s\n","Item Name: ",itemName , "Product ID : " , productID , "Item Price ($) : " , itemPrice , "Tax Price : ", taxPrice,  "Item Quantity(number of item in a bag) : ", itemQuantity, "Use By Date :" , usebyDate);
    }
}