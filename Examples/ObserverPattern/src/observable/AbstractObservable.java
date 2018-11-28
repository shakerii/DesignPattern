package observable;

import observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable implements ObservableInterface {

    private List<ObserverInterface> observers;

    AbstractObservable() {
        this.observers = new ArrayList<>();
    }

    @Override
    public ObservableInterface addObserver(ObserverInterface observer) {
        if (!this.observers.contains(observer))
            this.observers.add(observer);

        return this;
    }

    @Override
    public ObservableInterface removeObserver(ObserverInterface observer) {
        this.observers.remove(observer);

        return this;
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer: this.observers) {
            observer.update();
        }
    }
}
