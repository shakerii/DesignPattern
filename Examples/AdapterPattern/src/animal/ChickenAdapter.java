package animal;

public class ChickenAdapter implements AnimalAdapter {

    private Chicken chicken;

    public ChickenAdapter() {
        this(new Chicken());
    }

    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void action() {
        this.chicken.eat();
    }
}
