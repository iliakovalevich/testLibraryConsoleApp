package com.intexsoft;

import com.intexsoft.api.services.IBookService;
import com.intexsoft.io.IOConsole;
import com.intexsoft.services.BookService;

public class Main {

    public static void main(String[] args) {
        try {
            startMethod();
        } catch (Exception exception) {
            System.out.println(exception);
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
                    bookService.create(ioConsole.createNewBook());
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
