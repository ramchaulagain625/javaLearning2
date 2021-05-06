package com.class32.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String path="D:\\javaLearning2\\Files\\Configuration.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("UserName"));

        int iterations= Integer.parseInt(properties.getProperty("loop"));
        for (int i = 0; i <iterations ; i++) {
            System.out.println(properties.get("URL"));
        }
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        properties.setProperty("Name","Java is easy");
        properties.store(fileOutputStream,"Added my feeling");
    }
}
