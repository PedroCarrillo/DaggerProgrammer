package com.pedrocarrillo.daggeremployee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Coffee coffee = new Coffee();
        RedBull redBull = new RedBull();

        // Para crear un Computer necesito un Keyboard,Mouse y Screen

        Keyboard keyboard = new Keyboard("mechanical");
        Mouse mouse = new Mouse(6000);
        Screen screen = new Screen(20);

        Computer computer =  new Computer("hp", 2, keyboard, mouse, screen);

        //Para crear un programmer necesito un Energizer y un Computer
        Programmer programmer = new Programmer("Pedro Carrillo", "12345678", redBull, computer);

        programmer.energizer.energize();

    }
}
