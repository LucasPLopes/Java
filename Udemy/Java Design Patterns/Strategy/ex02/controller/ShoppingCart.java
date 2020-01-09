package controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ShoppingCart {
  private List<Product> products;

  public ShoppingCart() {
    setProductList(new ArrayList<>());
  }

  public void add(Product product) {
    products.add(product);
  }

  public void remove(Product product) {
    products.remove(product);
  }

  public int cost() {
    return products.stream().mapToInt(p -> p.getPrice()).sum();
  }

  public void pay(Payment paymentStatement) {
    Integer amount = cost();
    paymentStatement.pay(amount);
  }

  public List<Product> getProductList() {
    return products;
  }

  public void setProductList(List<Product> productList) {
    this.products = productList;
  }


}
