package com.example.petrik.service;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonStartService, buttonStopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        buttonStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getBaseContext(),ServiceMusic.class));

                //startForegroundService(new Intent(getBaseContext(),ServiceMusic.class));      // 26-os minimum SDK szint ( FIGYELMEZTETÉS!!) notification
            }
        });

        buttonStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getBaseContext(),ServiceMusic.class));
            }
        });

    }

    public void init()
    {
         buttonStartService = (Button) findViewById(R.id.buttonStartService);
         buttonStopService = (Button) findViewById(R.id.buttonStopService);

    }

}
