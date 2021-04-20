package com.intexsoft.api.services;

import java.util.List;
import java.util.Map;

public interface ICrudService<T> {
    void create(T entity);

    Map<String,T> readAll();

    void update(T entity);

    void delete(Integer id);

    T getById(Integer id);
}
