package observable;

import observer.ObserverInterface;

public interface ObservableInterface {

    ObservableInterface addObserver(ObserverInterface observer);

    ObservableInterface removeObserver(ObserverInterface observer);

    void notifyObservers();
}
