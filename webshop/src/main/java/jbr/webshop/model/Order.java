package jbr.webshop.model;

import java.util.Date;

import jbr.webshop.util.enums.DeliveryStatus;

public class Order {

  private String orderid;
  private String productid;
  private Date orderdate;
  private Date deliverydate;
  private DeliveryStatus deliverystatus;

  public String getOrderid() {
    return orderid;
  }

  public void setOrderid(String orderid) {
    this.orderid = orderid;
  }

  public String getProductid() {
    return productid;
  }

  public void setProductid(String productid) {
    this.productid = productid;
  }

  public Date getOrderdate() {
    return orderdate;
  }

  public void setOrderdate(Date orderdate) {
    this.orderdate = orderdate;
  }

  public Date getDeliverydate() {
    return deliverydate;
  }

  public void setDeliverydate(Date deliverydate) {
    this.deliverydate = deliverydate;
  }

  public DeliveryStatus getDeliverystatus() {
    return deliverystatus;
  }

  public void setDeliverystatus(DeliveryStatus deliverystatus) {
    this.deliverystatus = deliverystatus;
  }

}
