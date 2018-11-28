package factory;

import animal.Animal;

public interface AnimalFactory {

    /**
     * Factory method
     *
     * @return Animal
     */
    Animal create();
}
