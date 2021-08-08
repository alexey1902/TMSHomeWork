package Unit8.Unit8Task1;

public class NikeCoat implements Coat{
    @Override
    public void takeOn() {
        System.out.println("Надета куртка Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Nike");
    }
}
