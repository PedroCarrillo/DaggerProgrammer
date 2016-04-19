package com.pedrocarrillo.daggeremployee;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
@Module
public class AccessoriesModule {

    @Provides
    Keyboard providesKeyboard() {
        return new Keyboard("Mechanical");
    }

    @Provides
    Mouse providesMouse() {
        return new Mouse(6000);
    }

    @Provides
    Screen providesScreen() {
        return new Screen(20);
    }

}
