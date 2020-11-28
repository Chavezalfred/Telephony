package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView atname = (TextView) findViewById(R.id.atname);
        ImageButton btnPapamessage = (ImageButton) findViewById(R.id.btnPapamessage);
        ImageButton btnPapacall = (ImageButton) findViewById(R.id.btnPapacall);
        ImageButton btnRussmessage = (ImageButton) findViewById(R.id.btnRussmessage);
        ImageButton btnRusscall = (ImageButton) findViewById(R.id.btnRusscall);
        ImageButton btnJudelynmessage = (ImageButton) findViewById(R.id.btnJudelynmessage);
        ImageButton btnJudelyncall = (ImageButton) findViewById(R.id.btnJudelyncall);
        ImageButton btnAlexismessage = (ImageButton) findViewById(R.id.btnAlexismessage);
        ImageButton btnAlexiscall = (ImageButton) findViewById(R.id.btnAlexiscall);
        ImageButton btnVincentmessage = (ImageButton) findViewById(R.id.btnVincentmessage);
        ImageButton btnVincentcall = (ImageButton) findViewById(R.id.btnVincentcall);



        btnPapacall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Call.class);
                startActivity(intent);
            }
        });

        btnPapamessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Message.class);
                startActivity(intent);
            }
        });

        btnRusscall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,call1.class);
                startActivity(intent);
            }
        });

        btnRussmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,message1.class);
                startActivity(intent);
            }
        });

        btnJudelyncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,call2.class);
                startActivity(intent);
            }
        });

        btnJudelynmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,message2.class);
                startActivity(intent);
            }
        });

        btnAlexiscall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,call3.class);
                startActivity(intent);
            }
        });

        btnAlexismessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,message3.class);
                startActivity(intent);
            }
        });

        btnVincentcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,call4.class);
                startActivity(intent);
            }
        });

        btnVincentmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,message4.class);
                startActivity(intent);
            }
        });

    }
}