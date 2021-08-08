package Unit8.Unit8Task2;

public class Spaceport {
    public static void shuttleStart(IStart object){
        if(object.preStart()){
            object.engineStart();
            for (int i = 1; i<11; i++){
                System.out.println(i);
                try { Thread.sleep(1000); }
                catch (InterruptedException ignored) { }
            }
            object.start();
        }else {
            System.out.println("Предстартовая проверка провалена");
        }
    }
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
        IStart roskosmos = new RosKosmos();
        IStart spacex = new SpaceX();
        shuttleStart(shuttle);
        System.out.println();
        shuttleStart(roskosmos);
        System.out.println();
        shuttleStart(spacex);
        System.out.println();
    }
}
