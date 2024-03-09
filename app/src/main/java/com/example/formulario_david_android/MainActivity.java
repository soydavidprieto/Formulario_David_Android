package com.example.formulario_david_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inputName, inputEmail, inputPhone, inputMessage;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inputName = (EditText)findViewById(R.id.inputName);
        inputEmail = (EditText)findViewById(R.id.inputEmail);
        inputPhone = (EditText)findViewById(R.id.inputPhone);
        inputMessage = (EditText)findViewById(R.id.inputMessage);
        buttonSend = (Button)findViewById(R.id.buttonBack);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = inputName.getText().toString();
                String email = inputEmail.getText().toString();
                String phone = inputPhone.getText().toString();
                String message = inputMessage.getText().toString();
                Intent i = new Intent(MainActivity.this, ViewData.class);

                i.putExtra("name", name);
                i.putExtra("email", email);
                i.putExtra("phone", phone);
                i.putExtra("message", message);

                startActivity(i);
            }
        });
        }
    }