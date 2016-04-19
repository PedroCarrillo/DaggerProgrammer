package com.pedrocarrillo.daggeremployee;

import android.util.Log;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class Coffee implements Energizer {

    @Override
    public void drink() {
        Log.d("Coffee", "wakes you up");
    }
}
