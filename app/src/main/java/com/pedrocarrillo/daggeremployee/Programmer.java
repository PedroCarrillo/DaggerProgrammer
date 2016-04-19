package com.pedrocarrillo.daggeremployee;

import javax.inject.Inject;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class Programmer {

    public Energizer energizer;
    public Computer computer;

    @Inject
    public Programmer (Energizer energizer, Computer computer) {
        this.energizer = energizer;
        this.computer = computer;
    }

    public void startDay() {
        computer.on();
        energizer.drink();
    }

}
