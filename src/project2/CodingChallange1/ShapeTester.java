package project2.CodingChallange1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape []shapes = {new circle(),new Square()};
        for (Shape shape:shapes
             ) {
            shape.calculateArea(6);
            shape.calculatePerimeter(7);
        }
    }
}
