package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Date;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        DatePicker data1 = (DatePicker) findViewById(R.id.data);
        int data = data1.getDayOfMonth();
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text1);
        Denem dene = new Denem(text1,text2,data);
        intent.putExtra("sampleObject", dene);
        startActivity(intent);
    }
}