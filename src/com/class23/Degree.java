package com.class23;

public class Degree {
    void getPrerequisites(){
        System.out.println("To get a degree, you need high school diploma");
    }
}
class Bachelors extends Degree{
}
class Masters extends Degree{
    void getPrerequisites(){
        System.out.println("To get a degree, you need bachelor degree");
    }
}
class Tester{
    public static void main(String[] args) {
        Degree d=new Degree();
        d.getPrerequisites();
        Bachelors b=new Bachelors();
        b.getPrerequisites();
        Masters m= new Masters();
        m.getPrerequisites();
    }
}
