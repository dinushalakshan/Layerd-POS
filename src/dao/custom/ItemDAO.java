package dao.custom;

import dao.CrudDAO;
import dao.SuperDAO;
import entity.Item;

import java.util.List;

public interface ItemDAO extends CrudDAO<Item,String> {

//    public List<Item> findAllItems();
//
//    public Item findItem(String itemCode);
//
//    public boolean saveItem(Item item);
//
//    public boolean updateItem(Item item);
//
//    public boolean deleteItem(String itemCode);

    public String getLastItemCode();
}
