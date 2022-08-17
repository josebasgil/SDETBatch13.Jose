package com.syntax.reviewclass13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFiles {
    public static void main(String[] args) {
        // Location of the file in project, relative path not complete path
        String path="Files/Config.properties";
        FileInputStream fileInputStream=null;
        try {
            // Create a link between your ava program and this file
            fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ConfigReader.closeFile(fileInputStream);
        }


    }
}
