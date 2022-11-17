package bridge;

import bridge.Color.Blue;
import bridge.Color.Red;
import bridge.Shapes.Shape;
import bridge.Shapes.Square;
import bridge.Shapes.Triangle;

public class Demo {

    public static void main(String[] args) {
        Shape square = new Square(new Red());
        Shape triangle = new Triangle(new Blue());
        System.out.println(square.draw());
        System.out.println(triangle.draw());
    }

}
