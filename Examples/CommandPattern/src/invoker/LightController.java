package invoker;

import command.CommandInterface;

public class LightController extends Invoker {

    private CommandInterface key1;

    private CommandInterface key2;

    private CommandInterface key3;

    private CommandInterface key4;

    public LightController() {
    }

    public LightController setKey1Command(CommandInterface key1) {
        this.key1 = key1;
        return this;
    }

    public LightController setKey2Command(CommandInterface key2) {
        this.key2 = key2;
        return this;
    }

    public LightController setKey3Command(CommandInterface key3) {
        this.key3 = key3;
        return this;
    }

    public LightController setKey4Command(CommandInterface key4) {
        this.key4 = key4;
        return this;
    }

    public void function1() {
        this.key1.execute();
    }

    public void function2() {
        this.key2.execute();
    }

    public void function3() {
        this.key3.execute();
    }

    public void function4() {
        this.key4.execute();
    }
}
