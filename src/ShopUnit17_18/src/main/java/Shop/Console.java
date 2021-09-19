package Shop;

import static Shop.Methods.*;
import static Shop.ProdCons.imitate;

public class Console {

    private static final String mainMenu = "\n1 - Вывести товары\n2 - Добавить товар\n3 - Редактировать товар\n4 - Удалить товар\n5 - Создать отчёт\n6 - Создать XML\n7 - Имитировать спрос\n0 - Выход\n";

    private static final String sortMenu = "\nСортировать всё по:\n1 - Цене(Возрастание)\n2 - Цене(Убывание)\n3 - Дате добавления(новые -> поздние)\n4 - Вывод товаров в диапазоне\n0 - Выход\n";

    private static final String reportFilePath = "ShopUnit17_18/src/main/java/Shop/report.txt";

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
            switch (checkNumber(mainMenu, 7)) {
                case 1: { startSortMenu(shop); break;}
                case 2: { shop.addProduct(createNewProduct("Создайте новый товар")); break;}
                case 3: { shop.editProduct(createNewProduct("Создайте новый товар с уже существующим ID, для редактирования"));break;}
                case 4: { shop.deleteProduct();break; }
                case 5: { createReport(shop.getProductList(), reportFilePath); break; }
                case 6: { createXML(shop); break;}
                case 7: { imitate(shop);break;}
                case 0: { exit = true; serialize(shop); }
                serialize(shop);
            }
        }
    }

    public static void main(String[] args) { start(); }
}
