package com.syntax.javaclass33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        String path="Files/Config.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("the file path is not correct please double check it");
        }
    }
}
