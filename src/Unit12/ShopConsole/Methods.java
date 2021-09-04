package Unit12.ShopConsole;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public static void serialize(Shop shop) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Unit12/ShopConsole/products.dat"))) {
            oos.writeObject(shop.getProductList());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deserialize(Shop shop) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Unit12/ShopConsole/products.dat"))) {
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
            System.out.print(menu + "\nВведите номер: ");
            number = getPositiveNumber();
            if (number > maxAllowed) {
                System.out.println("Данного пункта меню нет!"); //очистить консоль
            } else {
                return number;
            }
        }
    }

    public static Product createNewProduct(String instruction){
        Scanner scanner = new Scanner(System.in);
        System.out.println(instruction + "\nВведите наименование: ");
        String name = scanner.nextLine();
        System.out.println("Введите цену: ");
        int price = getPositiveNumber();
        System.out.println("Введите ID: ");
        int id = getPositiveNumber();
        return new Product(id, price, name);
    }
}
