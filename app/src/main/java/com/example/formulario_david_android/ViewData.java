package com.example.formulario_david_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ViewData extends AppCompatActivity {
TextView nameText, emailText, phoneText, messageText;
Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_data);

        nameText = (TextView)findViewById(R.id.nameText);
        emailText = (TextView)findViewById(R.id.emailText);
        phoneText = (TextView)findViewById(R.id.phonetext);
        messageText = (TextView)findViewById(R.id.messageText);
        buttonBack = (Button)findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewData.this, MainActivity.class);
                startActivity(intent);
            }
        });

        viewData();
        }

    private void viewData() {
        Bundle data = this.getIntent().getExtras();
        String name = data.getString("name");
        String email = data.getString("email");
        String phone = data.getString("phone");
        String message = data.getString("message");

        nameText.setText(name);
        emailText.setText(email);
        phoneText.setText(phone);
        messageText.setText(message);

    }
    }
