package com.intexsoft;

import com.intexsoft.api.services.IBookService;
import com.intexsoft.entities.Book;
import com.intexsoft.io.IOConsole;
import com.intexsoft.io.IOFile;
import com.intexsoft.services.BookService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        try {
            startMethod();
        } catch (Exception exception) {

        }
    }

    private static void startMethod() {
        IOConsole ioConsole = new IOConsole();
        IBookService bookService = new BookService();
        while (true) {
            switch (ioConsole.inputChoseNumber()) {
                case "1":
                    ioConsole.printHashMapValues(bookService.readAll());
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Your input is incorrect, please try again ");
                    break;
            }
        }
    }

}
