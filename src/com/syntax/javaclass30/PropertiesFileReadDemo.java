package com.syntax.javaclass30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        /* get path of a file
         right click on any directory or package
         new => File => give any name and extension
         steps to get the path in intellij
         1) right click on any file
         2) click on get path reference
         3) select content root path
        */
        String path="Files/Abdul.properties";
        // navigate to this locaton with the felp of FileInputStream class if
        // we want to read the data or FileinputStream if we want to write
        // the data to file
        FileInputStream fileInputStream=new FileInputStream(path);
        // now we need a class that understand how to read the data from this file type
        Properties properties=new Properties();
        // loading the data from the file inside the properties object
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        fileInputStream.close();
    }
}
