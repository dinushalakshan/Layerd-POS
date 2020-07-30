package dao;

import dao.custom.CustomerDAO;
import dao.custom.ItemDAO;
import dao.custom.OrderDAO;
import dao.custom.OrderDetailDAO;
import dao.custom.impl.CustomerDAOImpl;
import dao.custom.impl.ItemDAOImpl;
import dao.custom.impl.OrderDAOImpl;
import dao.custom.impl.OrderDetailDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance() {
        return (daoFactory == null) ? daoFactory = new DAOFactory(): daoFactory;
    }

    public SuperDAO getDAO(int daoType){
        switch (daoType){
            case 0:
                return new CustomerDAOImpl();
            case 1:
                return new ItemDAOImpl();
            case 2:
                return new OrderDAOImpl();
            case 3:
                return new OrderDetailDAOImpl();
            default:
                return null;
        }
    }

   /* public CustomerDAO getCustomerDAO(){
        return new CustomerDAOImpl();
    }

    public ItemDAO getItemDAO(){
        return new ItemDAOImpl();
    }

    public OrderDAO getOrderDAO(){
        return new OrderDAOImpl();
    }

    public OrderDetailDAO getOrderDetailDAO(){
        return new OrderDetailDAOImpl();
    }*/


}
