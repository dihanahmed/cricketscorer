package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private EditText Email2;
    private EditText Password2;
    private TextView Enter;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Email2=(EditText)findViewById(R.id.email2);
        Password2=(EditText)findViewById(R.id.password2);
        Enter=(TextView)findViewById(R.id.enter);
        Login=(Button)findViewById(R.id.login);
        Register=(Button)findViewById(R.id.register);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login.this,signup.class);
                startActivity(intent);
            }
        });


    }
}
