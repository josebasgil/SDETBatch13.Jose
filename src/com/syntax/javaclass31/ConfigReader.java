package com.syntax.javaclass31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties Properties(String path) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);

        return properties;
    }

    public static Properties read(String configReaderPath) throws IOException {
        String path;
        FileInputStream fileInputStream=new FileInputStream(configReaderPath);
        Properties properties=new Properties();
        properties.load(fileInputStream);

        return properties;
    }
}
