package Unit8.Unit8Task1;

public class NikeTrousers implements Trousers{
    @Override
    public void takeOn() {
        System.out.println("Надеты штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Nike");
    }

}
