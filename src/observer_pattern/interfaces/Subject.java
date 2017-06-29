package observer_pattern.interfaces;

import observer_pattern.interfaces.Observer;

/**
 * Created by eliamyro on 29/6/17.
 */
public interface Subject {

    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
