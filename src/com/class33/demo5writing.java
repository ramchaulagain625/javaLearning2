package com.class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class demo5writing {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "\\files\\UserData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < noOfRows; i++) {
            Row row= sheet.getRow(i);
            if(i==0){
                Cell cell= row.createCell(3);
                cell.setCellValue("Salary");
                cell=row.createCell(4);
                cell.setCellValue("Age");
                cell=row.createCell(5);
                cell.setCellValue("Year Of experience");
            }else{
                Cell cell=row.createCell(3);
                Random random=new Random();

                cell.setCellValue( random.nextInt(150000));
            }

        }
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }
}
