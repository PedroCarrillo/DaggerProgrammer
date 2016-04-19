package com.pedrocarrillo.daggeremployee;

import android.util.Log;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class Computer {

    String model;
    int usbPorts;
    Keyboard keyboard;
    Mouse mouse;
    Screen screen;

    public Computer(String model, int usbPorts, Keyboard keyboard, Mouse mouse, Screen screen) {
        this.model = model;
        this.usbPorts = usbPorts;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.screen = screen;
    }


    public void on() {
        Log.e("Computer", "Turning on computer");
    }

}
