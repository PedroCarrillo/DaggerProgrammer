package com.pedrocarrillo.daggeremployee;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
@Module
public class ComputerModule {

    public String model;
    public int usbPorts;

    public ComputerModule(String model, int usbPorts) {
        this.model = model;
        this.usbPorts = usbPorts;
    }

    @Provides
    Computer providesComputer(Keyboard keyboard, Mouse mouse, Screen screen) {
        return new Computer(model, usbPorts, keyboard, mouse, screen);
    }

}
