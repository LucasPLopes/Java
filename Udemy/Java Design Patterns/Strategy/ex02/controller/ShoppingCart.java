package controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ShoppingCart {
   private  List<Product> productList;

    public ShoppingCart() {
        setProductList(new ArrayList<>());
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Product p: productList)
            {
                sum += p.getPrice();
            }
        return sum;
    }

    public void pay(Payment paymentStatement){
        int amount  = calculateTotal();
        paymentStatement.pay(amount);
    }
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

     
}