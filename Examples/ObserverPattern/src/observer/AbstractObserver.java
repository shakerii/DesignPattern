package observer;

import observable.ObservableInterface;

abstract class AbstractObserver implements ObserverInterface {

    ObservableInterface observable;

    AbstractObserver(ObservableInterface observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
}
