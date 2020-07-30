package dao;

import entity.Item;

public interface ItemDAO extends SuperDAO<Item,String> {

    String getLastItemCode();

}
