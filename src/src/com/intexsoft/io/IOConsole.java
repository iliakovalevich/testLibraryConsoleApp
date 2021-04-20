package com.intexsoft.io;

import java.util.Map;
import java.util.Scanner;

public class IOConsole {
    public String inputChoseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1-show all books \n 2-show all orders \n 0-exit ");
        System.out.println("Chose number from 0 to 2");
        String choseNumber = sc.next();
        return choseNumber;
    }

    public void printHashMapValues (Map hashMap) {
        for (Object value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
