package com.intexsoft.entities;

import java.util.List;
import java.util.Objects;

public class Book {
    String id;
    String title;
    String author;

    public Book() {
    }

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                '}';
    }
}
