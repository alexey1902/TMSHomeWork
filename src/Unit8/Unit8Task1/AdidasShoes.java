package Unit8.Unit8Task1;

public class AdidasShoes implements Shoes{

    @Override
    public void takeOn() {
        System.out.println("Надеты ботинки Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты ботинки Adidas");
    }
}
