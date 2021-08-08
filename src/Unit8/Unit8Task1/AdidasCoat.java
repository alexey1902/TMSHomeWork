package Unit8.Unit8Task1;

public class AdidasCoat implements Coat{
    @Override
    public void takeOn() {
        System.out.println("Надета куртка Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Adidas");
    }
}
