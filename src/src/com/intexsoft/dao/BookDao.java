package com.intexsoft.dao;

import com.intexsoft.api.dao.IBookDao;
import com.intexsoft.entities.Book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BookDao implements IBookDao {
    public static final String PATH_TO_FILE_WITH_BOOKS = "src/src/resources/books.properties";

    @Override
    public void create(Book entity) {

    }

    @Override
    public Map<String,String> readAll() {
        try {
            Map<String,String> hashMap =new HashMap<>();
            FileInputStream fileInputStream = new FileInputStream(PATH_TO_FILE_WITH_BOOKS);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            for (Object key : properties.keySet()) {
                hashMap.put(key.toString(), properties.getProperty(key.toString()));
            }
            return hashMap;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Book entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Book getById(Integer id) {
        return null;
    }
}
