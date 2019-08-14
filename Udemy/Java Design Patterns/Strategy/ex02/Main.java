import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;
import model.Product;

public class Main{
    public static void main(String[] args) {
        
        boolean cardPayment = false;

        ShoppingCart sc = new ShoppingCart();
        Product []products = new Product[3];
        
        products[0] = new Product("234", 15);
        products[1] = new Product("235", 55);
        products[2] = new Product("236", 27);
        
        for (int i = 0; i < products.length; i++) {
            sc.addProduct(products[i]);    
        }

         if(cardPayment)
            sc.pay(new CreditCardAlgorithm("Ferrari","01234567"));
        else
            sc.pay(new PaypalAlgorithm("l.lopes.fga@gmail.com","1234"));
        

    }
}