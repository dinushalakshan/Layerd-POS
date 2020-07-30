package dao;

import entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> findAllCustomers();

    public Customer findCustomer(String id);

    public boolean addCustomer(Customer customer);

    public boolean updateCustomer(Customer customer);

    public boolean deleteCustomer(String id);

    public String getLastCustomerID();
}
