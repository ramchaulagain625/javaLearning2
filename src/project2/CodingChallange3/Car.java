package project2.CodingChallange3;

public class Car {
    double carPrice;
    String color;
    void calculateSalesPrice(double carPrice){
        this.carPrice=carPrice;
        System.out.println("The sales value of car is "+carPrice);
    }
}
class Sedan extends Car{
    int length;
    void calculateSalesPrice(double carPrice,int length){
        this.carPrice=carPrice;
        this.length=length;
        if(length>20){
            double price=carPrice-(carPrice*0.05);
            System.out.println("The price of sedan after 5% discount is "+price);
        }else{
            double price=carPrice-(carPrice*0.10);
            System.out.println("The price of sedan after 10% discount is "+price);
        }
    }
}
class truck extends Car{
    int weight;
    void calculateSalesPrice(double carPrice,int weight){
        this.carPrice=carPrice;
        this.weight=weight;
        if(weight>2000){
            double price=carPrice-(carPrice*0.10);
            System.out.println("The price of truck after 10% discount is "+price);
        }else{
            double price=carPrice-(carPrice*0.20);
            System.out.println("The price of truck after 20% discount is "+price);
        }
    }
}

