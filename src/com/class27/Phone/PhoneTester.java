package com.class27.Phone;

public class PhoneTester {
    public static void main(String[] args) {
        iphone i= new iphone();
        i.displayPictures();
        i.sendTexts();
        Samsung s= new Samsung();
        s.unlockedPhone();
        s.displayPictures();
       // phone p = new phone(); We are not allowed to cteate an object of
        // abstract method because they are incomplete method

    }
}
