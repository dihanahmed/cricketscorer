package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private EditText Email;
    private TextView Newaccount;
    private Button Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);


        Name=(EditText)findViewById(R.id.name);
        Password=(EditText)findViewById(R.id.password);
        Email=(EditText)findViewById(R.id.email);
        Newaccount=(TextView)findViewById(R.id.createnewaccount);
        Signup=(Button)findViewById(R.id.signup);
        Signup.setOnClickListener(view ac);
    }

}
