package Unit6;

public class Military extends Air{
    int amountOfRockets;
    boolean isThereCatapult;

    public int getAmountOfRockets() {
        return amountOfRockets;
    }

    public boolean isThereCatapult() {
        return isThereCatapult;
    }

    Military(){
        super();
        this.amountOfRockets = 0;
        this.isThereCatapult = false;
    }
    Military(int powerHorse, int maxSpeed, int mass, Label label, int wingspan,
          int minLengthOfTheLine, int amountOfRockets, boolean isThereCatapult){
        super(powerHorse, maxSpeed, mass, label, wingspan, minLengthOfTheLine);
        this.amountOfRockets = amountOfRockets;
        this.isThereCatapult =  isThereCatapult;
    }
    void shot(){
        if(this.getAmountOfRockets()>0){
            System.out.println("Ракета запущена");
            this.amountOfRockets -- ;
        }else{
            System.out.println("Ракет нет");
        }
    }
    void catapult(){
        if(isThereCatapult){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    void show() {
        super.show();
        System.out.print("Количество рокет: " + this.getAmountOfRockets() +"\n"+
                "Катапульта: ");
        if(isThereCatapult){
            System.out.println("в наличие");
        }
        else{
            System.out.println("отсутствует");
        }
    }
}
