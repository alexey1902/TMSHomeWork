
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@XmlType(propOrder = {"name","price","id","dateTime"}, name ="product")
@XmlRootElement
public class Product implements Serializable {
    private int id;
    private int price;
    private String name;

    private LocalDateTime dateTime;

    public Product(){}

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

    public void setId(int id) { this.id = id; }

    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }

    public void show(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        System.out.println("Наименование: " + this.getName());
        System.out.println("Цена: " + this.getPrice());
        System.out.println("ID: " + this.getId());
        System.out.println("Добавлен: " + dtf.format(this.getDateTime()) + '\n');
    }

    public static String getNormalName(){
        String productName;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            productName = scanner.nextLine();
            Pattern pattern = Pattern.compile("^(([А-Я][а-я]*(\\s[А-Я]?[а-я]+)*)|([A-Z][a-z]*(\\s[A-Z]?[a-z]+)*))(\\s?[0-9]*)*$");
            Matcher matcher = pattern.matcher(productName);
            if(matcher.find()){
                return productName;
            }
            System.out.println("Вводите заново: ");
        }
    }
}