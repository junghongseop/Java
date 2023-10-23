package Class07;

abstract class Figure{
    public abstract double calculateArea();
}
class Triangle extends Figure{
    double width;
    double length;
    public Triangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return 0.5 * width * length;
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
class Circle extends Figure{
    private final static double PI = 3.14;
    private int radius;

    public Circle(double radius){
        this.radius= (int) radius;
    }

    @Override
    public double calculateArea(){
        return PI*Math.pow(radius,2);
    }
}
public class ex01 {
    public static void main(String[] args) throws Exception {
        Figure[] figures = new Figure[]{ new Triangle(2,2), new Rectangle(2,2), new Circle(2) };

        for(Figure figure : figures){
            System.out.println("도형의 넓이 : " + figure.calculateArea());
        }

    }
}