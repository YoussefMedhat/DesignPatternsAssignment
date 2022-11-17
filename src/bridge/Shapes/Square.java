package bridge.Shapes;

import bridge.Color.Color;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing Square. " + color.fill();
    }
}
