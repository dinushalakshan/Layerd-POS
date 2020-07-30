package dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import entity.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface SuperDAO <T extends SuperEntity , ID extends Serializable>{
    List<T> findAll();

    Object find(ID key);

    boolean save(T entity);

    boolean update(T entity);

    boolean delete(ID key);
}
