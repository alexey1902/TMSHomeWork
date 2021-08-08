package Unit8.Unit8Task1;

public class PumaShoes implements Shoes{
    @Override
    public void takeOn() {
        System.out.println("Надеты ботинки Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты ботинки Puma");
    }

}
