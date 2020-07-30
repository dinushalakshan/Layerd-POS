package dao;

import entity.Customer;

public interface CustomerDAO extends SuperDAO <Customer,String>{

    String getLastCustomerId();

}
