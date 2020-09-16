package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class match extends AppCompatActivity {

    private TextView runs;
    private TextView wickets;
    private TextView overs;
    private Button one;
    private Button two;
    private Button three;
    private Button six;
    private Button four;
    private Button wide;
    private Button no;
    private Button undo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        setupuiviews();
        one.setOnClickListener(v -> addRun(1));
        two.setOnClickListener(v -> addRun(2));
        three.setOnClickListener(v -> addRun(3));
        four.setOnClickListener(v -> addRun(4));
        six.setOnClickListener(v -> addRun(6));
        wide.setOnClickListener(v -> addRun(1));
        no.setOnClickListener(v -> addRun(1));




    }

    private void addRun(int run) {


        int score = Integer.parseInt(runs.getText().toString());
        runs.setText((run+score)+"");
    }

    private void setupuiviews() {

        one = (Button) findViewById(R.id.button4);
        two = (Button) findViewById(R.id.button5);
        three = (Button) findViewById(R.id.button6);
        four = (Button) findViewById(R.id.button2);
        six = (Button) findViewById(R.id.button3);
        no = (Button) findViewById(R.id.button8);
        wide = (Button) findViewById(R.id.button7);
        wickets = (Button) findViewById(R.id.button9);
        undo = (Button) findViewById(R.id.button11);
        runs = (TextView) findViewById(R.id.runs_made);
        wickets = (TextView) findViewById(R.id.wkts);
        overs = (TextView) findViewById(R.id.ovs);
    }
}
