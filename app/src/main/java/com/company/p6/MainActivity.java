package com.company.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int puntosA, puntosB;

    TextView marcadorA, marcadorB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marcadorA = findViewById(R.id.marcadorA);
        marcadorB = findViewById(R.id.marcadorB);

        findViewById(R.id.add3A).setOnClickListener(this);
        findViewById(R.id.add2A).setOnClickListener(this);
        findViewById(R.id.add1A).setOnClickListener(this);
        findViewById(R.id.add3B).setOnClickListener(this);
        findViewById(R.id.add2B).setOnClickListener(this);
        findViewById(R.id.add1B).setOnClickListener(this);
        findViewById(R.id.reset).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add3A: puntosA +=3; break;
            case R.id.add2A: puntosA +=2; break;
            case R.id.add1A: puntosA +=1; break;
            case R.id.add3B: puntosB +=3; break;
            case R.id.add2B: puntosB +=2; break;
            case R.id.add1B: puntosB +=1; break;
            case R.id.reset: puntosA =0; puntosB =0; break;
        }

        updateScores();
    }

    private void updateScores() {
        marcadorA.setText(String.valueOf(puntosA));
        marcadorB.setText(String.valueOf(puntosB));
    }
}
