

import java.util.ArrayList;
import java.util.List;

import SRP.Product;

class ShoppingCart {
    List<Product> shoppingCart = new ArrayList<>();

    public void addProductToCart(Product p) {
        shoppingCart.add(p);
    }

    public void removeProductFromCart(Product p) {
        shoppingCart.remove(p);
    }

    public Double calculateTotal() {
        Double sum = 0.0;
        for (Product product : shoppingCart) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void saveToDB() {
        System.out.println("Saving products to DB...");
    }

    public void printInvoice() {
        System.out.println("     Invoice     ");
        System.out.println("----------------");
        for (Product p : shoppingCart) {
            System.out.println("-> " +p.getName() + ", " + p.getPrice() + " - " + p.getDescription());
        }
    }

}

public class SRP_Violated {
    public static void main(String[] args) {
        ShoppingCart shopCart = new ShoppingCart();
        Product watch = new Product("Fastract Watch", 1099.0, "Analog Watch from Fastrack");
        Product shoe = new Product("New Balance Running Shoes", 3049.0, "Running Shoes from New Balance");
        shopCart.addProductToCart(watch);
        shopCart.addProductToCart(shoe);
        shopCart.calculateTotal();
        shopCart.printInvoice();
        shopCart.saveToDB();
    }
}
