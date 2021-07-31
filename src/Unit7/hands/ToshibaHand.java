package Unit7.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) { this.price = price; }

    public ToshibaHand() { }

    @Override
    public void upHand() {
        System.out.println("Поднята рука от Toshiba");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
