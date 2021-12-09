package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
AppCompatButton b1,b2;
String getName,getAddress,getPhoneNo,getEmail,getUserName,getPassword,getConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.Name);
        ed2=(EditText) findViewById(R.id.Address);
        ed3=(EditText) findViewById(R.id.Phone_no);
        ed4=(EditText) findViewById(R.id.Email);
        ed5=(EditText) findViewById(R.id.Username);
        ed6=(EditText) findViewById(R.id.Password);
        ed7=(EditText) findViewById(R.id.con_psd);
        b1=(AppCompatButton) findViewById(R.id.Register);
        b2=(AppCompatButton) findViewById(R.id.back_to_login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                getName=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getAddress,Toast.LENGTH_LONG).show();
                getName=ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getPhoneNo,Toast.LENGTH_LONG).show();
                getName=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
                getName=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getUserName,Toast.LENGTH_LONG).show();
                getName=ed6.getText().toString();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                getName=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getConfirmPassword,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}