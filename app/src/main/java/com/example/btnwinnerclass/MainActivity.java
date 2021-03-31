package com.example.btnwinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1, mbutton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.button1);
        mbutton2 = (Button) findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textview1);

        mButton1.setOnClickListener(new MyOnClickListener());
        mbutton2.setOnClickListener(new MyOnClickListener());
    }

    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1: mTextView1.setText("You Clicked button1"); break;
                case R.id.button2: mTextView1.setText("You Clicked button2"); break;
                default: break;
            }
        }
    }
}