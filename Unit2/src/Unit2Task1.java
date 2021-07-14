public class Unit2Task1 {
    public static void main(String[] args) {
        double way = 10;
        for(int i=0; i<7; i++)
        {
            way+=(way/10);
        }
        System.out.println("Суммарный путь равен " + way);
    }
}
