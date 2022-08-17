package com.syntax.reviewclass13;

import java.util.Properties;

public class ConfigFiles01 {
    public static void main(String[] args) {
        Properties properties=ConfigReader.read("Files/Config.properties");
        System.out.println(properties.getProperty("User"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));
    }
}
