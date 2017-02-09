package com.example.android.thebeatlesquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);


        Intent intent = getIntent();
        String message = intent.getStringExtra(Screen_2.EXTRA_MESSAGE);

        TextView textView = (TextView)findViewById(R.id.result);
        textView.setText(message);

    }

    public void reset(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
