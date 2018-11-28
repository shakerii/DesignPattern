package main;

import factory.*;

public class Main {

    public static void main(String[] args) {
        Factory windowsFactory = new WindowsFactory();
        Factory linuxFactory = new LinuxFactory();
        Factory macOSFactory = new MacOSFactory();

        windowsFactory.createButton().display();
        windowsFactory.createText().display();

        linuxFactory.createButton().display();
        linuxFactory.createText().display();

        macOSFactory.createButton().display();
        macOSFactory.createText().display();
    }
}
