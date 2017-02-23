package jbr.webshop.model;

import jbr.webshop.util.enums.ProductType;

public class Product {

  private String id;
  private ProductType type;
  private double price;
  private int stock;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductType getType() {
    return type;
  }

  public void setType(ProductType type) {
    this.type = type;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
