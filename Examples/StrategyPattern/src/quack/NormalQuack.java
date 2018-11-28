package quack;

public class NormalQuack implements QuackBehaviorInterface {

    @Override
    public void quack() {
        System.out.println("Quack normally");
    }
}
