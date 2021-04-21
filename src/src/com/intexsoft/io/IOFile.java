package com.intexsoft.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class IOFile {

    public void getAll() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        Set id;
        String values;
        try {
            fileInputStream = new FileInputStream("y");
            properties.load(fileInputStream);
            id = properties.keySet();
            Iterator iterator = id.iterator();
            while (iterator.hasNext()) {
                values = (String) iterator.next();
                System.out.println(id + " = " + properties.getProperty(values));
            }
        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {

        } catch (Exception exception) {

        }
    }
}
