package com.company.p6;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView marcadorA, marcadorB;
    PuntuacionViewModel puntuacionViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntuacionViewModel = ViewModelProviders.of(MainActivity.this).get(PuntuacionViewModel.class);

        marcadorA = findViewById(R.id.marcadorA);
        marcadorB = findViewById(R.id.marcadorB);

        findViewById(R.id.add3A).setOnClickListener(this);
        findViewById(R.id.add2A).setOnClickListener(this);
        findViewById(R.id.add1A).setOnClickListener(this);
        findViewById(R.id.add3B).setOnClickListener(this);
        findViewById(R.id.add2B).setOnClickListener(this);
        findViewById(R.id.add1B).setOnClickListener(this);
        findViewById(R.id.reset).setOnClickListener(this);

        updateScores();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add3A: puntuacionViewModel.puntosA +=3; break;
            case R.id.add2A: puntuacionViewModel.puntosA +=2; break;
            case R.id.add1A: puntuacionViewModel.puntosA +=1; break;
            case R.id.add3B: puntuacionViewModel.puntosB +=3; break;
            case R.id.add2B: puntuacionViewModel.puntosB +=2; break;
            case R.id.add1B: puntuacionViewModel.puntosB +=1; break;
            case R.id.reset: puntuacionViewModel.puntosA = 0; puntuacionViewModel.puntosB = 0; break;
        }

        updateScores();
    }

    private void updateScores() {
        marcadorA.setText(String.valueOf(puntuacionViewModel.puntosA));
        marcadorB.setText(String.valueOf(puntuacionViewModel.puntosB));
    }
}
