package dao;

import entity.Order;

public interface OrderDAO extends SuperDAO<Order,String> {

    String getLastOrderId();

}
