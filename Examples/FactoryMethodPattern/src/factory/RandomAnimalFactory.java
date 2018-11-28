package factory;

import animal.Animal;
import animal.Chicken;
import animal.Lion;

public class RandomAnimalFactory implements AnimalFactory {

    public Animal create() {
        int rand = (int) (Math.random() * 2);
        switch (rand) {
            case 0:
                return new Lion();
            case 1:
                return new Chicken();
            default:
                return null;
        }
    }
}
