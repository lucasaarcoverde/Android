package com.example.ana.aula_broadcasts_services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send = (Button) findViewById(R.id.button_broadcast);

        View.OnClickListener onClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setAction("isa.TESTE");
                sendBroadcast(it);

                Log.d("broadcast", "sent: " + it.getAction());

            }
        };


        send.setOnClickListener(onClickListener);

    }

}
