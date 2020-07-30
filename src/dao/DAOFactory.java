package dao;

import dao.custom.CustomerDAO;
import dao.custom.ItemDAO;
import dao.custom.OrderDAO;
import dao.custom.OrderDetailDAO;
import dao.custom.impl.*;

public class DAOFactory {

    //Start of Singleton Design Pattern
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){

        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }
    //ENd of Singleton Design Pattern

    public < T extends SuperDAO > T getDAO(DAOType daoType){

        switch (daoType){

            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            case ITEM:
                return (T) new ItemDAOImpl();
            case ORDER:
                return (T) new OrderDAOImpl();
            case ORDER_DETAIL:
                return (T) new OrderDetailDAOImpl();
            case QUERY:
                return (T) new QueryDAOImpl();
            default:
                return null;
        }
    }


    /*public CustomerDAO getCustomerDAO(){

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

