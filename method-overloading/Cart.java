public class Cart {
    public int cart;
    public String[] items = new String[3];
    public double[] prices = new double[3];
    public int itemCount;
    public double discount;
    
    
    public void create_cart(int cart) {
        this.cart = cart;
    }    
    
    public void addItem(String itemName, double price) {
        if (itemCount < 3) {
            items[itemCount] = itemName;
            prices[itemCount] = price;
            itemCount++;
            System.out.println(itemName + " added to cart " + cart + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }    
    
    public void addItem(double price, String itemName) {
        addItem(itemName, price);
    }    
    
    public void giveDiscount(double discount) {
        this.discount = discount;
    }
    
    public double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total * (1 - discount / 100);
    }
    
    public void cartDetails() {
        System.out.println("Your cart(c" + cart + ") : ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + calculateTotalPrice());
    }
}