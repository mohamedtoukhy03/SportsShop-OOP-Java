
public class Boots extends FootballShop implements DiscConsiderable {
    private int size;

    public Boots() {
    }

    public Boots(String brandName, double price, int quantity, int size) {
        super(quantity, brandName, price);
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("SOCCER BOOTS");
        System.out.println("Brand: " + super.getBrandName());
        System.out.println("Price: " + "$" + super.getPrice() + " for size " + size);
        System.out.println("Discount: " + (RATE * 100) + "%");
        System.out.println("Quantity: " + super.getQuantity());
        System.out.println("Subtotal: " + "$" +(float)calculatePrice() + "\n");
    }

    @Override
    public double calculatePrice() {
        double priceOfTheProduct = super.getPrice();
        double priceOfAllPieces = priceOfTheProduct * super.getQuantity();
        return calculateDiscount(priceOfAllPieces);
    }

    @Override
    public double calculateDiscount(double price) {
        return price - (price * RATE);
    }

}
