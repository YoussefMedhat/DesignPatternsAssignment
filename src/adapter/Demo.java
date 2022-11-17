package adapter;

import adapter.interfaces.Movable;
import adapter.interfaces.MovableAdapter;

public class Demo {
    
    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter movableAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(bugattiVeyron.getSpeed());
        System.out.println(movableAdapter.getSpeed());
        
    }
    
}
