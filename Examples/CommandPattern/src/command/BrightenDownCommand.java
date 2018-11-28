package command;

import receiver.Light;

public class BrightenDownCommand implements CommandInterface {

    private Light light;

    public BrightenDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.brightenDown();
    }

    @Override
    public void unexecute() {
        this.light.brightenUp();
    }
}
