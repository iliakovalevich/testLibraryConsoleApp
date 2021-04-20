package com.intexsoft.io;

import java.util.Scanner;

public class IOConsole {
    public String inputChoseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose number from 0 to 2");
        String choseNumber = sc.next();
        return choseNumber;
    }
}
