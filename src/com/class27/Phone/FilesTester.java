package com.class27.Phone;

public class FilesTester {
    public static void main(String[] args) {
     /*   PdfFile pdf = new PdfFile();
        pdf.closed();
        pdf.open();
        WordFiles word = new WordFiles();
        word.closed();
        word.open();*/
        Files[] file={new javaFiles(),new WordFiles(),new PdfFile()};
        for (Files files:file
             ) {
            files.open();
            files.closed();
            files.edit();
        }

    }
}
