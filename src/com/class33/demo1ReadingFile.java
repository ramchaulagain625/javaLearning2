package com.class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo1ReadingFile {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\files\\UserData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
       Sheet sheet= xssfWorkbook.getSheet("Sheet1");
       Row row= sheet.getRow(1);
       Cell cell=row.getCell(0);
        System.out.println(cell);
    }
}
