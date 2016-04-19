package com.pedrocarrillo.daggeremployee;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class Computer {

    String model;
    int usbPorts;
    Keyboard keyboard;
    Mouse mouse;
    Screen screen;

    public Computer() {
        model = "Hp";
        usbPorts = 2;
        keyboard = new Keyboard();
        mouse = new Mouse();
        screen = new Screen();
    }

}
