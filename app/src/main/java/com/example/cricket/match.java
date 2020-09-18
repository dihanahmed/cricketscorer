package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class match extends AppCompatActivity {
    private int balls = 0;
    private int batball = 0;

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
    private TextView CBATRUN;
    private TextView CBATBALLS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        setupuiviews();
        one.setOnClickListener(v -> addRun(v, 1));
        two.setOnClickListener(v -> addRun(v, 2));
        three.setOnClickListener(v -> addRun(v, 3));
        four.setOnClickListener(v -> addRun(v, 4));
        six.setOnClickListener(v -> addRun(v, 6));
        wide.setOnClickListener(v -> addRun(v, 1));
        no.setOnClickListener(v -> addRun(v, 1));
        WICKET.setOnClickListener(v -> addwicket(1));

        /*one.setOnClickListener(v -> addcbRun(1));
        two.setOnClickListener(v -> addcbRun(2));
        three.setOnClickListener(v -> addcbRun(3));
        four.setOnClickListener(v -> addcbRun(4));
        six.setOnClickListener(v -> addcbRun(6));
        wide.setOnClickListener(v -> addcbRun(1));
        no.setOnClickListener(v -> addcbRun(1));
        WICKET.setOnClickListener(v ->addcbwicket(1));*/


    }

    private void addRun(View button, int run) {


        int score = Integer.parseInt(runs.getText().toString());
        runs.setText((run + score) + "");
        CBRUN.setText("" + (run + Integer.parseInt(CBRUN.getText().toString())));
        CBATRUN.setText("" + (run + Integer.parseInt((CBATRUN.getText().toString()))));

        if (button.getId() != R.id.button7&&button.getId()!=R.id.button8){
            balls++;
            batball++;}
        CBATBALLS.setText("" + batball);

        if (balls == 6) {
            renewbowlar();
        }
    }

    private void addwicket(int bold) {

        int Wicket = Integer.parseInt(wickets.getText().toString());
        wickets.setText((bold + Wicket) + "");
        addcbwicket(bold);
        renewbatsman(bold);
    }

    /* private void addcbRun(int run) {


         int cbscore = Integer.parseInt(CBRUN.getText().toString());
         runs.setText((run+cbscore)+"");
     }*/
    private void addcbwicket(int bold) {

        int cbwicket = Integer.parseInt(CBWICKET.getText().toString());
        CBWICKET.setText((bold + cbwicket) + "");
        balls++;
        if (balls == 6) {
            renewbowlar();
        }

    }

    private void renewbowlar() {
        CBRUN.setText("0");
        CBWICKET.setText("0");
        balls = 0;


    }

    public void renewbatsman(int count) {
        CBATRUN.setText("0");
        CBATBALLS.setText("0");
        batball = 0;


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
        CBWICKET = (TextView) findViewById(R.id.cbwicket);
        CBATRUN = (TextView) findViewById(R.id.cbatrun);
        CBATBALLS = (TextView) findViewById(R.id.cbatballs);
    }
}
