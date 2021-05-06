package com.class32.ReviewsFileHandelling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExelWriting {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"//files//UserData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        //XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFWorkbook excel= new XSSFWorkbook(fileInputStream);
        Sheet sheet=excel.getSheet("Sheet1");
        Row row= sheet.getRow(3);
                 row.getCell(2).setCellValue("40");

        FileOutputStream fileOutputStream= new FileOutputStream(path);
        excel.write(fileOutputStream);


    }
}
