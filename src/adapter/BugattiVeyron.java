package adapter;

import adapter.interfaces.Movable;

public class BugattiVeyron implements Movable {

    @Override
    public double getSpeed() {
        return 260;
    }
}
