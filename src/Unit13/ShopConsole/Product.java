package Unit13.ShopConsole;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product implements Serializable {
    private final int id;
    private int price;
    private String name;
    LocalDateTime dateTime;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.dateTime = LocalDateTime.now();
    }

    public int getId() { return id; }

    public int getPrice() { return price; }

    public String getName() { return name; }

    public LocalDateTime getDateTime() { return dateTime; }

    public void setPrice(int price) { this.price = price; }

    public void setName(String name) { this.name = name; }

    public void show(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        System.out.println("Наименование: " + this.getName());
        System.out.println("Цена: " + this.getPrice());
        System.out.println("ID: " + this.getId());
        System.out.println("Добавлен: " + dtf.format(this.getDateTime()));
        System.out.println();
    }
}