package project2.CodingChallange3;

public class CarTester {
    public static void main(String[] args) {
        Sedan car= new Sedan();
        car.calculateSalesPrice(50000,20);
        truck t = new truck();
        t.calculateSalesPrice(60000,30000);
    }
}
