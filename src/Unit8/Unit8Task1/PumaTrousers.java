package Unit8.Unit8Task1;

public class PumaTrousers implements Trousers{
    @Override
    public void takeOn() {
        System.out.println("Надеты штаны Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Puma");
    }

}
