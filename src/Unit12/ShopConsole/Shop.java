package Unit12.ShopConsole;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Unit13.ShopConsole.Methods.getPositiveNumber;

public class Shop implements Serializable {
    private List<Product> productList;

    public Shop(){ this.productList = new ArrayList<>(); }

    public List<Product> getProductList() { return this.productList; }

    public void setProductList(List<Product> productList) { this.productList = productList; }

    private boolean isThereId(int id){
        if(this.getProductList()!=null) {
            for (Product productCheck : this.getProductList()) {
                if (id == productCheck.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addProduct(Product product){
        if(isThereId(product.getId())){
            System.out.println("Товар с таким ID уже добавлен!");
        }
        else {
            this.productList.add(product);
        }
    }

    public void deleteProduct(){
        System.out.println("Введите ID для удаления: ");
        int id = getPositiveNumber();
        if(isThereId(id)){
            int i = 0;
            for(Product deleteProduct: this.getProductList()){
                if(deleteProduct.getId() == id){ break; }
                i++;
            }
            this.productList.remove(i);
            System.out.println("Товар был успешно удалён!");
        }
        else{
            System.out.println("Такого товара нет в списке!");
        }
    }

    public void editProduct(Product editedProduct){
        if(isThereId(editedProduct.getId())){
            for(Product product: this.productList){
                if(product.getId() == editedProduct.getId()){
                    product.setName(editedProduct.getName());
                    product.setPrice(editedProduct.getPrice());
                }
            }
        }
        else{
            System.out.println("Такого ID для редактирования нет в списке товаров!");
        }
    }

    public void sort(int choose)
    {
        List<Product> products = this.getProductList();
        switch (choose){
            case 1 ->   products.sort(Comparator.comparing(Product::getPrice));
            case 2 ->   products.sort(Comparator.comparing(Product::getPrice).reversed());
            case 3 ->   products.sort(Comparator.comparing(Product::getDateTime).reversed());
        }
        System.out.println();
        for(Product product: products){
            product.show();
        }
    }
}
