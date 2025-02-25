
public abstract class FootballShop implements Comparable<FootballShop>{
    private int quantity;
    private String brandName;
    private double price;

    public FootballShop() {
    }

    public FootballShop(int quantity, String brandName, double price) {
        this.quantity = quantity;
        this.brandName = brandName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void display();

    public abstract double calculatePrice();

    @Override
    public int compareTo(FootballShop o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
