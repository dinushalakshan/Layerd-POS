package dao.custom;

import dao.SuperDAO;
import entity.entity.CustomerEntity;

public interface QueryDAO extends SuperDAO{

    CustomerEntity getOrderDetail();
}
