package com.example.anonsurf.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RadioButton vb = (RadioButton)findViewById(R.id.rb3).;
    }

    public void checkOptions(View v){
        RadioButton view = (RadioButton) v;
        String content=null;
        switch(view.getId()){
            case R.id.rb1:
                if(view.isChecked())    content = "pomme";
                break;
            case R.id.rb2:
                if(view.isChecked())    content = "banana";
                break;
            case R.id.rb3:
                if(view.isChecked())    content = "kiwi";
                break;
        }
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
    }
}
