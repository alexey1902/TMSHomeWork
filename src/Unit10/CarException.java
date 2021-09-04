package Unit10;

public class CarException extends Exception{
    private final int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }


    public CarException(String message, int randomNumber) {
        super(message);
        this.randomNumber = randomNumber;
    }

}
