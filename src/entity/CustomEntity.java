package entity;

import java.sql.Date;

public class CustomEntity implements SuperEntity {

  private String orderId;
  private String customerName;
  private Date orderDate;
  private String customerId;

  public CustomEntity() {
  }
  // Join Query Fields walata adalawa constructor fields dala, Query ganata constructors hadanawa
  public CustomEntity(String orderId, String customerName, Date orderDate) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.orderDate = orderDate;
  }

  public CustomEntity(String orderId, String customerName, String customerId) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.customerId = customerId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
}
