package com.example.adam.dolgozat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dolgozat extends AppCompatActivity {

    private Button gomb1;
    private Button gomb2;
    private Button gomb3;
    private TextView gomb0;
    private int szam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolgozat);

        gomb1 = (Button) findViewById(R.id.gomb1);
        gomb2 = (Button) findViewById(R.id.gomb2);
        gomb3 = (Button) findViewById(R.id.gomb3);
        gomb0 = (TextView) findViewById(R.id.gomb0);


        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam++;
                gomb0.setText("" + szam);

            }
        });
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam--;
                gomb0.setText("" + szam);

            }
        });
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam = 0;
                gomb0.setText("" + szam);

            }
        });




    }
}