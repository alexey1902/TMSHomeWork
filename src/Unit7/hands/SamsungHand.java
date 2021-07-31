package Unit7.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) { this.price = price; }

    public SamsungHand() { }

    @Override
    public void upHand() { System.out.println("Поднята рука от Samsung"); }

    @Override
    public int getPrice() { return this.price; }
}
