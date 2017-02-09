package com.example.android.thebeatlesquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Screen_2 extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_2);
    }


    public void scoreSummary(View view){
        RadioButton radio_1 = (RadioButton)findViewById(R.id.correct_1);
        RadioButton radio_2 = (RadioButton)findViewById(R.id.correct_2);
        RadioButton radio_3 = (RadioButton)findViewById(R.id.correct_3);
        RadioButton radio_4 = (RadioButton)findViewById(R.id.correct_4);
        RadioButton radio_5 = (RadioButton)findViewById(R.id.correct_5);

        boolean checked = radio_1.isChecked();
        boolean checked2 = radio_2.isChecked();
        boolean checked3 = radio_3.isChecked();
        boolean checked4 = radio_4.isChecked();
        boolean checked5 = radio_5.isChecked();

        if (checked)
        {
            score = score +1;
        }
        if (checked2)
        {
            score = score +1;
        }
        if (checked3)
        {
            score = score +1;
        }
        if (checked4)
        {
            score = score +1;
        }
        if (checked5)
        {
            score = score +1;
        }

        sendMessage(setText(score));
    }


    private String setText (int result) {
        if (result < 3) {
            String text = getString(R.string.score1) + score;
            return text;

        } else if (result >= 3 && result <= 4) {
            String text = getString(R.string.score2) + score;
            return text;
        } else {
            String text = getString(R.string.score3) + score;
            return text;
        }}

    private String sendMessage (String message){
        Intent intent = new Intent(this, Screen3.class);
                intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        return message;
    }
}
