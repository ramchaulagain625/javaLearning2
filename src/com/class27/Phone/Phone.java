package com.class27.Phone;

public class Phone {

}
abstract  class phone{
    void makeCalls(){

    }
    void sendTexts(){
        System.out.println("send a message when click send");

    }
    abstract void displayPictures();
    abstract  void unlockedPhone();
}
class iphone extends phone{
    void displayPictures(){
        System.out.println("Display a picture");
    }

    @Override
    void unlockedPhone() {
        System.out.println("Thumb unlock");
    }
}
class Samsung extends phone{
    @Override
    void unlockedPhone() {
        System.out.println("can unlock with pin and thumb");
    }

    @Override
    void displayPictures() {
        System.out.println("Use gallery to display the picture");
    }
}
