package com.example.anonsurf.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> tab = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkOptions(View v){
        CheckBox view = (CheckBox) v;
        switch(view.getId()){
            case R.id.chbx1:
                if(view.isChecked())    tab.add("pomme");
                else tab.remove("pomme");
                break;
            case R.id.chbx2:
                if(view.isChecked())    tab.add("banana");
                else tab.remove("banana");
                break;
            case R.id.chbx3:
                if(view.isChecked())    tab.add("kiwi");
                else tab.remove("kiwi");
                break;
        }
    }

    public void show(View view){
        String content = "";
        for (String i : tab) content += i + " ";
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
    }
}
