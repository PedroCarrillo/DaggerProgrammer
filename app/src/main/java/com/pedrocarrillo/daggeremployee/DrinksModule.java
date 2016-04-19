package com.pedrocarrillo.daggeremployee;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
@Module
public class DrinksModule {

    @Provides
    Energizer providesEnergizer() {
        return new Coffee();
    }

}
