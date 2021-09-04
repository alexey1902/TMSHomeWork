package ShopUnit14_15;

import static ShopUnit14_15.Methods.*;

public class Console {
    private static final String mainMenu = """
                
                1 - Вывести товары
                2 - Добавить товар
                3 - Редактировать товар
                4 - Удалить товар
                0 - Выход
                """;
    private static final String sortMenu = """
                
                Сортировать всё по:
                1 - Цене(Возрастание)
                2 - Цене(Убывание)
                3 - Дате добавления(новые -> поздние)
                4 - Вывод товаров в диапазоне
                0 - Выход
                """;

    public static void startSortMenu(Shop shop){
        boolean exit = false;
        while (!exit) {
           exit = shop.sort (checkNumber(sortMenu, 4));
        }
    }

    public static void start() {
        Shop shop = new Shop();
        deserialize(shop);
        boolean exit = false;
        while (!exit) {
            switch (checkNumber(mainMenu, 4)) {
                case 1 -> startSortMenu(shop);
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
