package command;

import receiver.Light;

public class TurnOnCommand implements CommandInterface {

    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void unexecute() {
        this.light.turnOff();
    }
}
