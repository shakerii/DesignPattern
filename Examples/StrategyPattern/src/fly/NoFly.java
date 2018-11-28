package fly;

public class NoFly implements FlyBehaviorInterface {

    @Override
    public void fly() {
        System.out.println("No flying...");
    }
}
