package com.pedrocarrillo.daggeremployee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Programmer globalProgrammer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Programmer programmer = DaggerDemoComponent.builder()
                .computerModule(new ComputerModule("macbook", 10))
                .build()
                .programmer();


        DaggerDemoComponent.builder().computerModule(new ComputerModule("macbook", 10)).build().inject(this);

        turnOn();
    }

    private void turnOn() {
        globalProgrammer.startDay();
    }


}
