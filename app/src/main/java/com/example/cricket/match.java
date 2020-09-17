package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class match extends AppCompatActivity {
    private int balls=0;

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
    private Button WICKET;
    private TextView CBRUN;
    private TextView CBWICKET;


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
        WICKET.setOnClickListener(v ->addwicket(1));

        /*one.setOnClickListener(v -> addcbRun(1));
        two.setOnClickListener(v -> addcbRun(2));
        three.setOnClickListener(v -> addcbRun(3));
        four.setOnClickListener(v -> addcbRun(4));
        six.setOnClickListener(v -> addcbRun(6));
        wide.setOnClickListener(v -> addcbRun(1));
        no.setOnClickListener(v -> addcbRun(1));
        WICKET.setOnClickListener(v ->addcbwicket(1));*/



    }

    private void addRun(int run) {


        int score = Integer.parseInt(runs.getText().toString());
        runs.setText((run+score)+"");
        CBRUN.setText(""+(run+Integer.parseInt(CBRUN.getText().toString())));

        balls++;
        if(balls==6){
           renewbowlar();
        }
    }

    private void addwicket(int bold){

        int Wicket= Integer.parseInt(wickets.getText().toString());
        wickets.setText((bold+Wicket)+"");
        addcbwicket(bold);
    }
   /* private void addcbRun(int run) {


        int cbscore = Integer.parseInt(CBRUN.getText().toString());
        runs.setText((run+cbscore)+"");
    }*/
    private void addcbwicket(int bold){

        int cbwicket= Integer.parseInt(CBWICKET.getText().toString());
        CBWICKET.setText((bold+cbwicket)+"");
        balls++;
        if(balls==6){
            renewbowlar();
        }

    }
    private void renewbowlar(){
        CBRUN.setText("0");
        CBWICKET.setText("0");
        balls=0;


    }

    private void setupuiviews() {

        one = (Button) findViewById(R.id.button4);
        two = (Button) findViewById(R.id.button5);
        three = (Button) findViewById(R.id.button6);
        four = (Button) findViewById(R.id.button2);
        six = (Button) findViewById(R.id.button3);
        no = (Button) findViewById(R.id.button8);
        wide = (Button) findViewById(R.id.button7);
        WICKET = (Button) findViewById(R.id.button9);
        undo = (Button) findViewById(R.id.button11);
        runs = (TextView) findViewById(R.id.runs_made);
        wickets = (TextView) findViewById(R.id.wkts);
        overs = (TextView) findViewById(R.id.ovs);
        CBRUN = (TextView) findViewById(R.id.cbrun);
        CBWICKET= (TextView) findViewById(R.id.cbwicket);
    }
}
