
public class freshfruits extends Product {

    private int itemWeight;

    public freshfruits(String itemName, int productID, int itemPrice, double taxPrice, int itemWeight) {
        super(itemName, productID, itemPrice, taxPrice);
        this.itemWeight= itemWeight;
    }


    public String toString() {
        return String.format("%s %s\n%s%s\n%s%s\n%s%s\n%s%s\n","Item Name: ",itemName , "Product ID : " , productID , "Item Price ($) : " , itemPrice , "Tax Price : ", taxPrice,  "Item Weight(gram) : ", itemWeight);
    }
}

