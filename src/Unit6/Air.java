package Unit6;


public class Air extends Transport{
    int wingspan;
    int minLengthOfTheLine;

    Air(){
        super();
        this.wingspan = 0;
        this.minLengthOfTheLine = 0;
    }
    Air(int powerHorse, int maxSpeed, int mass, Label label, int wingspan, int minLengthOfTheLine){
        super(powerHorse, maxSpeed, mass, label);
        this.wingspan = wingspan;
        this.minLengthOfTheLine = minLengthOfTheLine;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinLengthOfTheLine() {
        return minLengthOfTheLine;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Размах крыльев: " + this.getWingspan() + "\n" +
                "Посад.линия: " + this.getMinLengthOfTheLine());
    }
}
