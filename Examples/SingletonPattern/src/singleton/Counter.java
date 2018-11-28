package singleton;

public class Counter {

    private static Counter instance;

    private int count;

    private Counter() {
        this.count = 0;
    }

    public void count() {
        System.out.println("Counter: " + count);
        this.count++;
    }

    public static Counter getInstance() {
        if (instance == null)
            instance = new Counter();
        return instance;
    }
}
