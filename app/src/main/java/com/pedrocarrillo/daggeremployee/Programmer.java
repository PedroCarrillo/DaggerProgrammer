package com.pedrocarrillo.daggeremployee;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class Programmer {

    public String name;
    public String phoneNumber;
    public Energizer energizer;
    public Computer computer;

    public Programmer(String name, String phoneNumber, Energizer energizer, Computer computer) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.energizer = energizer;
        this.computer = computer;
    }

}
