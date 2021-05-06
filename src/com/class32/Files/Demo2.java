package com.class32.Files;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws IOException {
String path="D:\\javaLearning2\\Files\\UserData.xlsx";
        System.out.println(path);
        FileInputStream inputStream= new FileInputStream(path);
        XSSFWorkbook excelFiles= new XSSFWorkbook(inputStream);
       Sheet sheet1= excelFiles.getSheet("Sheet1");
       Row row=sheet1.getRow(1);
       Cell cell = row.getCell(1);
        System.out.println(cell);

    }
}
