package Unit6;

public class Civil extends Air {
    int amountOfPassengers;
    boolean isThereBusiness;

    Civil(){
        super();
        this.amountOfPassengers = 0;
        this.isThereBusiness = false;
    }
    Civil(int powerHorse, int maxSpeed, int mass, Label label, int wingspan,
          int minLengthOfTheLine, int amountOfPassengers, boolean isThereBusiness){
        super(powerHorse, maxSpeed, mass, label, wingspan, minLengthOfTheLine);
        this.amountOfPassengers = amountOfPassengers;
        this.isThereBusiness = isThereBusiness;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public boolean isThereBusiness() {
        return isThereBusiness;
    }

    void checkPassengers(int amountOfPassengers) {
        if (amountOfPassengers <= this.getAmountOfPassengers()) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }

    @Override
    void show() {
        super.show();
        System.out.print("Количество пассажиров: " + this.getAmountOfPassengers() +"\n"+
                         "Бизнес класс: ");
        if(isThereBusiness){
            System.out.println("в наличие");
        }
        else{
            System.out.println("отсутствует");
        }
    }
}
