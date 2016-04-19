package com.pedrocarrillo.daggeremployee;

import android.util.Log;

/**
 * Created by PedroCarrillo on 4/19/16.
 */
public class RedBull implements Energizer {

    @Override
    public void drink() {
        Log.d("Redbull", "gives you wings");
    }

}
