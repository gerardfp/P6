package com.company.p6;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class PuntuacionViewModel extends AndroidViewModel {

    int puntosA, puntosB;

    public PuntuacionViewModel(@NonNull Application application) {
        super(application);
    }
}
