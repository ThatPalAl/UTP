package LambdaExpressions.e8;

public class Item {

    int price;
    String itemName;
    public Item(String itemName, int price) {
        this.price = price;
        this.itemName = itemName;
    }

    public Item() {
    }

    ItemGenerator itg = new ItemGenerator();

    @Override
    public String toString() {
        return "itemName='" + itemName;
    }

    public int getPrice() {
        return price;
    }
}
