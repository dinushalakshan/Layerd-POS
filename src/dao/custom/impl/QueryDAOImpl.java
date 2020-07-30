package dao.custom.impl;

import dao.custom.QueryDAO;
import db.DBConnection;
import entity.CustomEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {

  @Override
  public CustomEntity getOrderDetail(String orderId) {
    Connection connection = DBConnection.getInstance().getConnection();
    PreparedStatement pstm = null;
    try {
      pstm = connection.prepareStatement("SELECT c.id,c.name ,o.id FROM'Order'o\n" +
              "INNER JOIN Customer c on o.customerId =c.Id\n" +
              "WHERE o.id=?");
      pstm.setObject(1,orderId);
      ResultSet rst = pstm.executeQuery();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }


  @Override
  public CustomEntity getOrderDetail2(String orderId) {
    Connection.
  }
}
