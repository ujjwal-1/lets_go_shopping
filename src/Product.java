
public class Product {

    protected String itemName;
    protected int productID;
    protected int itemPrice;
    protected double taxPrice;

    public Product(String itemName, int productID, int itemPrice, double taxPrice){
        this.itemName=itemName;
        this.productID=productID;
        this.itemPrice=itemPrice;
        this.taxPrice=taxPrice;
    }

    public String toString() {
        return String.format("%s %s\n%s%s\n","Item Name: ",itemName , "Product ID : " , productID);
    }

}