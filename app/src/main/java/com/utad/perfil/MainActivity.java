package com.utad.perfil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private View mtext;
    private boolean visible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch visibleButton = findViewById(R.id.btnVisible);
//        visibleButton = findViewById(R.id.btnVisible);
        Button goneButton = findViewById(R.id.btnInvisible);


//        visibleButton.OnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                mtext.setVisibility(View.GONE);
//
//            }
//        });

        goneButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mtext.setVisibility(View.GONE);

            }
        });

        visibleButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mtext.setVisibility(View.VISIBLE);

            }
        });
    }
}

