package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


class demo1ExceptionHandling {
    public static void main(String[] args) {
        String path= System.getProperty("user.dir")+"\\files\\UserData.xlsx";
        System.out.println(path);
        try {
            FileInputStream fileInputStream= new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
