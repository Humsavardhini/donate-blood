package com.example.donateblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name,bloodgroup,address;
    int contactnum;

    EditText nameInput;
    EditText bloodgroupInput;
    EditText addressInput;
    EditText contactnumInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput=(EditText) findViewById(R.id.nameinput);
        bloodgroupInput=(EditText) findViewById(R.id.bloodgrp);
        addressInput=(EditText) findViewById(R.id.Address);
        contactnumInput=(EditText) findViewById(R.id.Phone);

        submitButton= (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name= nameInput.getText().toString();
                bloodgroup= bloodgroupInput.getText().toString();
                address = addressInput.getText().toString();
                contactnum = Integer.valueOf(contactnumInput.getText().toString());

                showToast(name);
                showToast(bloodgroup);
                showToast(address);
                showToast(String.valueOf(contactnum));

            }
        });
    }


    private void showToast(String text){
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}