package animal;

public class BirdAdapter implements AnimalAdapter {

    private Bird bird;

    public BirdAdapter() {
        this(new Bird());
    }

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void action() {
        this.bird.fly();
    }
}
