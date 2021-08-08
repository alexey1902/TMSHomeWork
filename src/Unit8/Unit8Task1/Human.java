package Unit8.Unit8Task1;

public class Human {
    private String name;
    private Coat coat;
    private Trousers trousers;
    private Shoes shoes;

    Human(){ }

    Human(String name, Coat coat, Trousers trousers, Shoes shoes){
        this.name = name;
        this.coat = coat;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void getDressed(){
        this.coat.takeOn();
        this.trousers.takeOn();
        this.shoes.takeOn();
    }

    public void getUndressed(){
        this.coat.takeOff();
        this.trousers.takeOff();
        this.shoes.takeOff();
    }

    public static void main(String[] args) {
        Coat coat = new NikeCoat();
        Trousers trousers = new AdidasTrousers();
        Shoes shoes = new PumaShoes();
        Human human = new Human("Petrov", coat, trousers, shoes);
        human.getDressed();
        human.getUndressed();
    }
}
