package com.syntax.javaclass33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path) throws IOException {
        //Navigate to that location

        // Properties class that handles the .properties files
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);

            //Loads the data from the HardDrive to RAM
            properties.load(fileInputStream);
        } catch (IOException io) {
            System.out.println("Please check the file at this path: " + path);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException ioException) {
                    System.out.println("Error while closing the file");
                }
            }
            return properties;
        }
    }
}