package com.example.telephony;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class message4 extends AppCompatActivity {
    EditText editNumber, editmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message4);
        editNumber = (EditText) findViewById(R.id.editNumber);
        editmessage = (EditText) findViewById(R.id.editmessage);

    }

    public void btnSend (View view){
        int permissionCheck= ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        }
        else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},0);
        }
    }

    public void sendMessage() {
        String number;
        String message;

        number = editNumber.getText().toString().trim();
        message = editmessage.getText().toString().trim();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(number, null, message, null, null);
        Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
    }
}
