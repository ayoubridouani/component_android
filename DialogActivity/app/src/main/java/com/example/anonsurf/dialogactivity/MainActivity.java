package com.example.anonsurf.dialogactivity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                View viewk = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_layout, null);
                //dialog.setContentView(R.layout.dialog_layout);
                dialog.setContentView(viewk);
                dialog.show();
            }
        });

    }
}
