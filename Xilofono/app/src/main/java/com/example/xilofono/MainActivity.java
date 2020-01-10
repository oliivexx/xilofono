package com.example.xilofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btDo, btRe, btMi, btFa, btSol, btLa, btSi;
    static MediaPlayer mpDo, mpRe, mpMi, mpFa, mpSol, mpLa, mpSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    protected void onResume() {
        super.onResume();
        mpDo = MediaPlayer.create(this, R.raw.note1);
        mpRe = MediaPlayer.create(this, R.raw.note2);
        mpMi = MediaPlayer.create(this, R.raw.note3);
        mpFa = MediaPlayer.create(this, R.raw.note4);
        mpSol = MediaPlayer.create(this, R.raw.note5);
        mpLa = MediaPlayer.create(this, R.raw.note6);
        mpSi = MediaPlayer.create(this, R.raw.note7);

        btDo = findViewById(R.id.bt_do);
        btRe = findViewById(R.id.bt_re);
        btMi = findViewById(R.id.bt_mi);
        btFa = findViewById(R.id.bt_fa);
        btSol = findViewById(R.id.bt_sol);
        btLa = findViewById(R.id.bt_la);
        btSi = findViewById(R.id.bt_si);




        btDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDo.start();
            }
        });

        btRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpRe.start();
            }
        });

        btMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpMi.start();
            }
        });

        btFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpFa.start();
            }
        });

        btSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSol.start();
            }
        });

        btLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpLa.start();
            }
        });

        btSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSi.start();
            }
        });


    }
}
