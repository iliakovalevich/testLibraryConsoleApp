package com.intexsoft;

import com.intexsoft.io.IOConsole;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            startMethod();
        } catch (Exception exception) {

        }
    }

    private static void startMethod() {
        IOConsole ioConsole = new IOConsole();
        while (true) {
            switch (ioConsole.inputChoseNumber()) {
                case "1":
                    System.out.println("1");
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
