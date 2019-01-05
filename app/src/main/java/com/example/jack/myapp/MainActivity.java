package com.example.jack.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button herfBtn1;
    private Button herfBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        herfBtn1 = (Button)findViewById(R.id.button);
        herfBtn1.setOnClickListener(listener);
        herfBtn2 = (Button)findViewById(R.id.button2);
        herfBtn2.setOnClickListener(listener2);
    }
    private Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, QrActivity.class);
            startActivity(intent);
        }
    };
    private Button.OnClickListener listener2 = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, OriActivity.class);
            startActivity(intent);
        }
    };

}
