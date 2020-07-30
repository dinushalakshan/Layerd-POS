package dao;

import entity.Item;

import java.util.List;

public interface ItemDAO {

    public List<Item> findAllItems();

    public Item findItem(String id);

    public boolean addItem(Item item);

    public boolean updateItem(Item item);

    public boolean deleteItem(String id);

    public String getLastItemID();
}
