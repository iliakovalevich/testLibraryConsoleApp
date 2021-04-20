package com.intexsoft;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static final String PATH_PROPERTIES_FILE = "src/src/resources/config.properties";

    public static void main(String[] args) {
        FileInputStream fileInputStream;

        Properties properties = new Properties();
        Set keys;
        String str;
        try {
            fileInputStream = new FileInputStream(PATH_PROPERTIES_FILE);
            properties.load(fileInputStream);
            keys = properties.keySet();
            Iterator iterator = keys.iterator();
            while (iterator.hasNext()) {
                str = (String) iterator.next();
                System.out.println(str + " = " + properties.getProperty(str));
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
