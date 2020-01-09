package model;

public class Product {
  private String code;
  private int price;

  public Product() {
    code = "";
    price = 0;
  }

  public Product(String code, int price) {

    this.code = code;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }


}
