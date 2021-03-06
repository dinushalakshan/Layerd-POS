package dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.custom.CustomerDAO;
import db.DBConnection;
import entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

  @Override
  public List<Customer> findAll() {
    Connection connection = DBConnection.getInstance().getConnection();
    try {

      Statement stm = connection.createStatement();
      ResultSet rst = stm.executeQuery("SELECT * FROM Customer");
      ArrayList<Customer> customer = new ArrayList<>();
      while (rst.next()) {
        customer.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3)));
      }

      return customer;

    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
  }

  @Override
  public Customer find(String key) {
    Connection connection = DBConnection.getInstance().getConnection();
    try {

      PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Customer WHERE id=?");
      pstm.setObject(1, key);
      ResultSet rst = pstm.executeQuery();
      if (rst.next()) {
        return new Customer(rst.getString(1), rst.getString(2), rst.getString(2));
      }

      return null;

    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
  }

  @Override
  public boolean save(Customer customer) {
    Connection connection = DBConnection.getInstance().getConnection();
    try {
      PreparedStatement pstm = connection
          .prepareStatement("INSERT INTO Customer VALUES (?,?,?)");
      pstm.setObject(1, customer.getId());
      pstm.setObject(2, customer.getName());
      pstm.setObject(3, customer.getAddress());

      return pstm.executeUpdate() > 0;


    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean update(Customer customer) {
    Connection connection = DBConnection.getInstance().getConnection();
    try {
      PreparedStatement pstm = connection
          .prepareStatement("UPDATE Customer SET name=?, address=? WHERE id=?");
      pstm.setObject(1, customer.getId());
      pstm.setObject(2, customer.getName());
      pstm.setObject(3, customer.getAddress());

      return pstm.executeUpdate() > 0;


    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean delete(String key) {
    Connection connection = DBConnection.getInstance().getConnection();
    try {

      PreparedStatement pstm = connection
          .prepareStatement("DELETE FROM Customer WHERE id=?");
      pstm.setObject(1, key);

      return pstm.executeUpdate() > 0;

    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return false;
    }
  }

  public String getLastCustomerId() {
    try {
      Connection connection = DBConnection.getInstance().getConnection();
      Statement stm = connection.createStatement();
      ResultSet rst = stm.executeQuery("SELECT * FROM Customer ORDER BY id DESC LIMIT 1");
      if (!rst.next()) {
        return null;
      } else {
        return rst.getString(1);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
  }
}
