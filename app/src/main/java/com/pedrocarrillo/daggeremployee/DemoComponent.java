package com.pedrocarrillo.daggeremployee;

import dagger.Component;

/**
 * Created by PedroCarrillo on 4/19/16.
 */

@Component(
    modules = {
            ComputerModule.class,
            AccessoriesModule.class,
            DrinksModule.class
    }
)
public interface DemoComponent {

    Programmer programmer();
    void inject(MainActivity activity);

}
