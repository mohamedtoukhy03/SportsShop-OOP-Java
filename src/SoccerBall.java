public class SoccerBall extends FootballShop {
    private int ballType;

    public SoccerBall() {
    }

    public SoccerBall(String brandName, double price, int quantity, int ballType) {
        super(quantity, brandName, price);
        this.ballType = ballType;
    }

    @Override
    public void display() {
        System.out.println("SOCCER BALL");
        System.out.println("Brand :" + super.getBrandName());
        try {
            if (ballType == 1) {
                System.out.println("Type  :" + "Professional Match");
                super.setPrice(200);
            } else if (ballType == 2) {
                System.out.println("Type  :" + "Match");
                super.setPrice(80);
            } else if (ballType == 3) {
                System.out.println("Type  :" + "Training");
                super.setPrice(50);
            } else if (ballType == 4) {
                System.out.println("Type  :" + "Recreational ");
                super.setPrice(20);
            } else {
                throw new NotBallException(
                        ballType + " Not a valid soccer ball type, Changing the soccer ball type to training ball\n");
            }
            System.out.println("price :$" + getPrice());
            System.out.println("No Discount!");
            System.out.println("Quantity:" + super.getQuantity());
            System.out.println("Subtotal: "+ "$" + (float)calculatePrice() + "\n");
        } catch (NotBallException e) {
            System.out.println(e.getMessage());
            ballType = 3;
            display();
        }
    }

    @Override
    public double calculatePrice() {
        return super.getQuantity() * super.getPrice();
    }

}
