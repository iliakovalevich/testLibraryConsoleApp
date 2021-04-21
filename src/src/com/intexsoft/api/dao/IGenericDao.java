package com.intexsoft.api.dao;

import java.util.List;
import java.util.Map;

public interface IGenericDao<T> {
    void create(T entity);

    Map<String,String> readAll();

    void update(T entity);

    void delete(Integer id);

    T getById(Integer id);
}
