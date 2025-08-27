import SRP.Product;
import java.util.List;
import java.util.ArrayList;

class ShoppingCart2 {
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

class InvoicePrinter1 {
    ShoppingCart2 shopCart;

    InvoicePrinter1(ShoppingCart2 sc) {
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

interface DBStorage1 {
    public void save();
}

class MongoStorage implements DBStorage1 {

    ShoppingCart2 shopCart;

    MongoStorage(ShoppingCart2 sp) {
        shopCart = sp;
    }

    public void save() {
        System.out.println("Saving to Mongo DB....");
    }

}

class SQLStorage implements DBStorage1 {
    ShoppingCart2 shopCart;

    SQLStorage(ShoppingCart2 sp) {
        shopCart = sp;
    }

    public void save() {
        System.out.println("Saving to SQL DB....");
    }

}

class FileStorage implements DBStorage1 {
    ShoppingCart2 shopCart;

    FileStorage(ShoppingCart2 sp) {
        shopCart = sp;
    }

    public void save() {
        System.out.println("Saving to File....");
    }
}

public class OC_Followed {
    public static void main(String[] args) {
        ShoppingCart2 shopCart = new ShoppingCart2();
        System.out.println("Your cart total is: " + shopCart.calculateTotal());
        Product watch = new Product("Fastract Watch", 1099.0, "Analog Watch from Fastrack");
        Product shoe = new Product("New Balance Running Shoes", 3049.0, "Running Shoes from New Balance");
        shopCart.addProductToCart(watch);
        shopCart.addProductToCart(shoe);
        InvoicePrinter1 iPrinter = new InvoicePrinter1(shopCart);
        DBStorage1 mongoDb = new MongoStorage(shopCart);
        DBStorage1 sqlDb = new SQLStorage(shopCart);
        DBStorage1 file = new FileStorage(shopCart);
        iPrinter.printInvoice();
        mongoDb.save();
        sqlDb.save();
        file.save();
    }
}