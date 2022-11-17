package bridge.Shapes;

import bridge.Color.Color;

public class Triangle extends Shape{


    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing triangle. " + color.fill();
    }
}
