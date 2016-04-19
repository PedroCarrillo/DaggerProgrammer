package com.pedrocarrillo.daggeremployee;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class Programmer {

    public String name;
    public String phoneNumber;
    public Energizer energizer;
    public Computer computer;

    public Programmer() {
        name = "Pedro";
        phoneNumber = "001201020";
        energizer = new RedBull();
        computer = new Computer();
    }

}
