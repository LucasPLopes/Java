import java.util.*;
import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;
import model.Product;



public class Main {
  public static void main(String[] args) {

    boolean cardPayment = false;

    ShoppingCart sc = new ShoppingCart();
    List<Product> products = new ArrayList<>();
    products.add(new Product("234", 15));
    products.add(new Product("235", 55));
    products.add(new Product("236", 27));

    products.forEach(p -> sc.add(p));

    if (cardPayment)
      sc.pay(new CreditCardAlgorithm("Ferrari", "01234567"));
    else
      sc.pay(new PaypalAlgorithm("l.lopes.fga@gmail.com", "1234"));


  }
}
