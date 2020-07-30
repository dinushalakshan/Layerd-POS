package dao;

import java.io.Serializable;
import java.util.List;

import entity.SuperEntity;

public interface CrudDAO <T extends SuperEntity,ID extends Serializable> extends SuperDAO{

  List<T> findAll();

  T find(ID key);

  boolean save(T entity);

  boolean update(T entity);

  boolean delete(ID key);

}
