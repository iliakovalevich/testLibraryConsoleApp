package com.intexsoft.io;

import com.intexsoft.entities.Book;

import java.util.Map;
import java.util.Scanner;

public class IOConsole {
    public String inputChoseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1-show all books \n 2-add new book in library \n 0-exit ");
        System.out.println("Chose number from 0 to 2");
        String choseNumber = sc.next();
        return choseNumber;
    }

    public void printHashMapValues (Map hashMap) {
        for (Object value : hashMap.values()) {
            System.out.println(value);
        }
    }

    public Book createNewBook () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input book title:");
        String title = sc.next();
        System.out.println("Input book author:");
        String author = sc.next();
        Book book = new Book(title,author);
        return book;
    }
}
