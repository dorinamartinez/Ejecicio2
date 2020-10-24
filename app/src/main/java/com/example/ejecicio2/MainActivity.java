package com.example.ejecicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vincula al boton del archivo activity_main.xml con el MainActivity.java
        Button btnMA = findViewById(R.id.btnMA);

        btnMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ira2 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(ira2);
            }
        });
    }
}