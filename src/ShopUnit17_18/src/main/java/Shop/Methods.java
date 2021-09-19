package Shop;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import com.sun.istack.NotNull;
import static Shop.Product.getNormalName;
public class Methods{

    private static final String filePath = "ShopUnit17_18/src/main/java/Shop/products.dat";

    public static void serialize(Shop shop) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(shop.getProductList());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    public static void deserialize(Shop shop) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            shop.setProductList ((List<Product>) ois.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getIntNumber() {
        int rightNumber;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                rightNumber = scanner.nextInt();
                break;
            } else {
                System.out.println("Введена не цифра!\nВводите заново: ");
            }
        }
        return rightNumber;
    }

    public static int getPositiveNumber() {
        int positiveNumber;
        while (true) {
            positiveNumber = getIntNumber();
            if (positiveNumber >= 0) {
                break;
            } else {
                System.out.println("Данная переменная не может быть отрицательной!\nВводите заново: ");
            }
        }
        return positiveNumber;
    }

    public static int checkNumber(String menu, int maxAllowed) {
        int number;
        while (true) {
            System.out.println(menu + "\nВведите номер: ");
            number = getPositiveNumber();
            if (number > maxAllowed) {
                System.out.println("Данного пункта меню нет!"); //очистить консоль
            } else {
                return number;
            }
        }
    }

    public static @NotNull
    Product createNewProduct(String instruction){
        System.out.println(instruction + "\nВведите наименование: ");
        String name = getNormalName();
        System.out.println("Введите цену: ");
        int price = getPositiveNumber();
        System.out.println("Введите ID: ");
        int id = getPositiveNumber();
        return new Product(id, price, name);
    }

    public static void createReport(List<Product> listForReport, String reportFilePath){
        Runnable task = () -> {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(reportFilePath))){
                    for (Product product: listForReport) {
                        bw.write("Наименование: " + product.getName()+ '\n' +
                                "Цена: " + product.getPrice()+ '\n' +
                                "ID: " + product.getId()+ '\n'+
                                "Время: " + product.getDateTime()+ '\n'+'\n');
                        bw.flush();
                    }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    public static void createXML(Shop shop){
        Marshaller marshaller = new Marshaller();
        marshaller.marshall(shop);
    }
}
