package command;

import receiver.Light;

public class BrightenUpCommand implements CommandInterface {

    private Light light;

    public BrightenUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.brightenUp();
    }

    @Override
    public void unexecute() {
        this.light.brightenDown();
    }
}
