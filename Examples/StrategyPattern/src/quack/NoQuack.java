package quack;

public class NoQuack implements QuackBehaviorInterface {

    @Override
    public void quack() {
        System.out.println("No quacking...");
    }
}
