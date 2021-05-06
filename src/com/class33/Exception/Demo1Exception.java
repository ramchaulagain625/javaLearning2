package com.class33.Exception;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1Exception {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\files\\UserData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {

        }
        XSSFWorkbook xssfWorkbook = null;
        try {
            xssfWorkbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
    }
}
