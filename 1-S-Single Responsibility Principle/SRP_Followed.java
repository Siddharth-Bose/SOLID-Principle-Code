import SRP.Product;
import java.util.List;
import java.util.ArrayList;

class ShoppingCart1 {
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

    public List<Product> getProducts() {
        return this.shoppingCart;
    }
}

class InvoicePrinter {
    ShoppingCart1 shopCart;

    InvoicePrinter(ShoppingCart1 sc) {
        shopCart = sc;
    }

    public void printInvoice() {
        System.out.println("      Invoice     ");
        System.out.println("-----------------");
        for (Product p : shopCart.getProducts()) {
            System.out.println("-> " + p.getName() + ", " + p.getPrice() + " - " + p.getDescription());
        }
    }
}

class DBStorage {
    ShoppingCart1 shopCart;

    DBStorage(ShoppingCart1 sp) {
        this.shopCart = sp;
    }

    public void saveToDB() {
        System.out.println("Saving to DB....");
    }
}

public class SRP_Followed {
    public static void main(String[] args) {
        ShoppingCart1 shopCart = new ShoppingCart1();
        System.out.println("Your cart total is: " + shopCart.calculateTotal());
        Product watch = new Product("Fastract Watch", 1099.0, "Analog Watch from Fastrack");
        Product shoe = new Product("New Balance Running Shoes", 3049.0, "Running Shoes from New Balance");
        shopCart.addProductToCart(watch);
        shopCart.addProductToCart(shoe);
        InvoicePrinter iPrinter = new InvoicePrinter(shopCart);
        DBStorage db = new DBStorage(shopCart);
        iPrinter.printInvoice();
        db.saveToDB();
    }
}