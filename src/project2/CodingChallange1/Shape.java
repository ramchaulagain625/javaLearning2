package project2.CodingChallange1;

public interface Shape {
    void calculateArea(int length);
    void calculatePerimeter(int length);
}
class circle implements Shape {
    @Override
    public void calculateArea(int length) {
        double areaOfsquare=  (Math.PI*length*length);
        System.out.println("The area of circle is "+areaOfsquare);

    }

    @Override
    public void calculatePerimeter(int length) {
        double perimeterOfCircle=2*Math.PI*length;
        System.out.println("The perimeter of circle "+perimeterOfCircle);

    }


}
class Square implements Shape{
    @Override
    public void calculateArea(int length) {
        int area = length*length;
        System.out.println("The area of square is "+area);

    }

    @Override
    public void calculatePerimeter(int length) {
        int perimeter = 4*length;
        System.out.println("The perimeter of square is "+perimeter);

    }

}


