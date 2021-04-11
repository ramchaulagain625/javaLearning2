package com.class27.Phone;

abstract public class Files {
    public void open(){
        System.out.println("Can open the files any where");
    }
    public void edit(){
        System.out.println("Can edit the files");
    }
    abstract public void closed();

}
class javaFiles extends Files{
    public void closed(){
        System.out.println("Can closed any time");
    }
    public void open(){
        System.out.println("to open .java file we need notepad++ or sublime text");
    }

}
class WordFiles extends Files {
public void open(){
    System.out.println("to open .doc file we need Microsoft word to be installed ");
}
public void closed(){
    System.out.println("Please click the x for closed");
}
}
class PdfFile extends Files{
    public void closed(){
        System.out.println("Please click the x for closed");
    }
}
