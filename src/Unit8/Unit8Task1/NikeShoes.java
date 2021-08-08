package Unit8.Unit8Task1;

public class NikeShoes implements Shoes{
    @Override
    public void takeOn() {
        System.out.println("Надеты ботинки Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты ботинки Nike");
    }
}
