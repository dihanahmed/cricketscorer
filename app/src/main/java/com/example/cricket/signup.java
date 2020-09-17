package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity  implements View.OnClickListener {
    private EditText Name;
    private EditText Password;
    private EditText Email;
    private TextView Newaccount;
    private Button Signup;
SQlitedatabase sQlitedatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);

sQlitedatabase =new SQlitedatabase(this);
  SQLiteDatabase sqLiteDatabase =sQlitedatabase.getWritableDatabase();
        Name=(EditText)findViewById(R.id.name);
        Password=(EditText)findViewById(R.id.password);
        Email=(EditText)findViewById(R.id.email);
        Newaccount=(TextView)findViewById(R.id.createnewaccount);
        Signup=(Button)findViewById(R.id.signupID);

        Signup.setOnClickListener(this);
        /*Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,MainActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onClick(View view) {
String name=Name.getText().toString();
        String pass=Password.getText().toString();
        String email=Email.getText().toString();

if(view.getId()==R.id.signupID){
  long rowId=sQlitedatabase.insertData(name , email, pass);
if(rowId==-1){
    Toast.makeText(getApplicationContext(), "unseccessful",Toast.LENGTH_LONG);

} else {
    Toast.makeText(getApplicationContext(), "row "+rowId+" is inserted",Toast.LENGTH_LONG);
}
}

    }
}
