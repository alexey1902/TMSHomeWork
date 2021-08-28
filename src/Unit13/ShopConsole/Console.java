package Unit13.ShopConsole;

import static Unit13.ShopConsole.Methods.*;

public class Console {
    public static String mainMenu = """
                
                1 - Вывести все товары
                2 - Добавить товар
                3 - Редактировать товар
                4 - Удалить товар
                0 - Выход
                """;
    public static String sortMenu = """
                
                Сортировать всё по:
                1 - Цене(Возрастание)
                2 - Цене(Убывание)
                3 - Дате добавления(новые -> поздние)
                0 - Выход
                """;

    public static void start2(Shop shop){
        boolean exit = false;
        while (!exit) {
            switch (checkNumber(sortMenu, 3)) {
                case 1 -> shop.sort(1);
                case 2 -> shop.sort(2);
                case 3 -> shop.sort(3);
                case 0 -> exit = true;
            }
        }
    }

    public static void start() {
        Shop shop = new Shop();
        deserialize(shop);
        boolean exit = false;
        while (!exit) {
            switch (checkNumber(mainMenu, 4)) {
                case 1 -> start2(shop);
                case 2 -> shop.addProduct(createNewProduct("Создайте новый товар"));
                case 3 -> shop.editProduct(createNewProduct("Создайте новый товар с уже существующим ID, для редактирования"));
                case 4 -> shop.deleteProduct();
                case 0 -> { exit = true; serialize(shop); }
            }
            serialize(shop);
        }
    }

    public static void main(String[] args) {
        start();
    }
}
