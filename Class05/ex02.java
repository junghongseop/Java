package Class05;

import java.io.PrintStream;
import java.util.Scanner;

class Circle{
    int x;
    int y;
    int radius;

    Circle(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double calculateArea(){
        return 3.14 * radius * radius;
    }

    void printCoordinates(){
        System.out.printf("중심점 : ( %d, %d )\n", x, y);
    }

}

public class ex02 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int xCoordinate = sc1.nextInt();
        int yCoordinate = sc1.nextInt();
        int radius = sc1.nextInt();
        sc1.close();

        Circle circle = new Circle(xCoordinate, yCoordinate, radius);

        circle.printCoordinates();
        System.out.printf("원의 넓이 : %.2f%n", circle.calculateArea());
    }
}
