package main;

import command.*;
import invoker.LightController;
import receiver.Light;

public class Main {

    public static void main(String[] args) {
        Light light = new Light(false, 0.5, 0.1);

        CommandInterface func1 = new TurnOnCommand(light);
        CommandInterface func2 = new TurnOffCommand(light);
        CommandInterface func3 = new BrightenUpCommand(light);
        CommandInterface func4 = new BrightenDownCommand(light);

        LightController lc = new LightController();
        lc.setKey1Command(func1)
                .setKey2Command(func2)
                .setKey3Command(func3)
                .setKey4Command(func4);

        lc.function1();

        lc.function3();
        lc.function3();

        System.out.println("Light is " + (light.isOn() ? "on" : "off"));
        System.out.println("Brightness : " + light.getBrightness());
    }
}
