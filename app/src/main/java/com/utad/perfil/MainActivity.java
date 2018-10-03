package com.utad.perfil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private View textDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textDescription = findViewById(R.id.txtDescripcion);
        final Button visibleButton = findViewById(R.id.btnVisible);
        final Button goneButton = findViewById(R.id.btnInvisible);

        goneButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textDescription.setVisibility(View.GONE);


            }

        });
        visibleButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textDescription.setVisibility(View.VISIBLE);


            }

        });

    }
}
