package com.example.dataku_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button adiatButton, bellaButton, agitaButton, adiButton, aubinButton, bagusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adiatButton = findViewById(R.id.adiatButton);
        adiatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move1 = new Intent(Home.this,adiatPage.class);
                startActivity(move1);
            }
        });

        Button bellaButton = findViewById(R.id.bellaButton);
        Button aubinButton = findViewById(R.id.aubinButton);
        Button bagusButton = findViewById(R.id.bagusButton);
        Button adiButton = findViewById(R.id.adiButton);
        Button agitaButton = findViewById(R.id.agitaButton);


    }

}