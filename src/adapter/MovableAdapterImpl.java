package adapter;

import adapter.interfaces.Movable;
import adapter.interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
}
