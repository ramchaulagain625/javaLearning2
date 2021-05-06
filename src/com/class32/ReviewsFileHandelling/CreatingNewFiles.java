package com.class32.ReviewsFileHandelling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingNewFiles {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\files\\UserData1.xlsx";
        System.out.println(path);
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Sheet1");
        Row row= sheet.createRow(0);
        Cell cell =row.createCell(0);
        cell.setCellValue("First Name");

        cell=row.createCell(1);
        cell.setCellValue("Last Name");
        cell=row.createCell(2);
        cell.setCellValue("Email Address");
        cell=row.createCell(3);
        cell.setCellValue("Age");
        row=sheet.createRow(1);
        cell= row.createCell(0);
        cell.setCellValue("Rammani");
        cell= row.createCell(1);
        cell.setCellValue("Chaulagain");
        row.createCell(2).setCellValue("Ramchaulagain625@gmail.com");
        row.createCell(3).setCellValue("28");


        FileOutputStream fileOutputStream1= new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream1);

        FileInputStream fileInputStream= new FileInputStream(path);
        xssfWorkbook.getSheet("Sheet1");

    }
}
