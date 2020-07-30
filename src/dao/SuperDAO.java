package dao;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

public interface SuperDAO <T,ID>{
    List<T> findAll();

    Object find(ID key);

    boolean save(T entity);

    boolean update(T entity);

    boolean delete(ID key);
}
