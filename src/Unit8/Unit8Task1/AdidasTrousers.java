package Unit8.Unit8Task1;

public class AdidasTrousers implements Trousers{
    @Override
    public void takeOn() {
        System.out.println("Надеты штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Adidas");
    }
}
