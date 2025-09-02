package Angel.app;

import Angel.app.Interfaces.Shape;
import Angel.app.models.Rectangle;
import Angel.app.models.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);

        Square square = new Square(5);
        getArea(rect);
        getArea(square);


    }

    static void getArea(Shape s) {
        System.out.println(
                "The area of the " + s.getClass().getName() +
                        " is: " + s.getArea()
        );
    }

}