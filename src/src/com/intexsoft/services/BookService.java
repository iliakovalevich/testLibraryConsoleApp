package com.intexsoft.services;

import com.intexsoft.api.dao.IBookDao;
import com.intexsoft.api.services.IBookService;
import com.intexsoft.dao.BookDao;
import com.intexsoft.entities.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService implements IBookService {
    IBookDao bookDao = new BookDao();

    @Override
    public void create(Book entity) {
        Integer id = readAll().size() + 1;
        String idBook = Integer.toString(id);
        Book book = new Book(idBook,entity.getTitle(),entity.getAuthor());
        bookDao.create(book);
    }

    @Override
    public Map<String, Book> readAll() {
        Map<String, String> stringStringMap;
        Map<String,Book> stringBookMap = new HashMap<>();
        stringStringMap = bookDao.readAll();
        List<String> keysList;
        keysList = stringStringMap.keySet().stream().toList();
        for (String key : keysList) {
            String str = stringStringMap.get(key);
            String[] words = str.split(";");
            Book book = new Book();
            book.setId(key);
            book.setTitle(words[0]);
            book.setAuthor(words[1]);
            stringBookMap.put(key,book);
        }
        return stringBookMap;
    }

    @Override
    public void update(Book entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Book getById(Integer id) {
        Map<String,Book> stringBookMap = readAll();
        return stringBookMap.get(id.toString());
    }
}
