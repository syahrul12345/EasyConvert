package model;

import java.util.Observable;
import java.util.Observer;

public class DimensionObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
