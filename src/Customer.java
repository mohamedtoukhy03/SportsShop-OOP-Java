
import java.util.Arrays;

public class Customer {
    private String nameOfTheUser;
    private double TotalPrice;
    private int numOfItems;
    private FootballShop[] itemList = new FootballShop[4];

    public Customer(String nameOfTheUser) {
        this.nameOfTheUser = nameOfTheUser;
    }

    public String getName() {
        return nameOfTheUser;
    }

    public double getTotalPrice() {
        for (int i = 0; i < getNumOfItems(); ++i) {
            TotalPrice += itemList[i].calculatePrice();
        }
        return TotalPrice;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void buy(FootballShop product) {
        int i = getNumOfItems();
        itemList[i] = product;
        System.out.println("Item " + (i + 1));
        itemList[i].display();
        numOfItems++;
    }

    public String toString() {
        return ("Welcome " + getName() + "\n\n" + "List of Football Items Bought\n");
    }

    public void print() {
        double finalCost = getTotalPrice();
        System.out.println("Total = $" + finalCost);
    }

    public void printSorted() {
        Arrays.sort(itemList);
    }
}
