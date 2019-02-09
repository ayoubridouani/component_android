package com.example.anonsurf.togglebuttonswitch;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    private ToggleButton tglBtn;
    private Switch switcher;
    private TextView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tglBtn = findViewById(R.id.tglBtn);
        switcher = findViewById(R.id.switcher);
        pass = findViewById(R.id.pass);
        //pass.setEnabled(false);
        pass.setVisibility(View.INVISIBLE);



        tglBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass.setEnabled(true);

                ToggleButton vk = (ToggleButton) v;
                if(!vk.isChecked())
                pass.setVisibility(View.INVISIBLE);
                else pass.setVisibility(View.VISIBLE);
            }
        });
        switcher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Switch vk = (Switch) v;
                if(vk.isChecked())
                pass.setInputType(View.AUTOFILL_TYPE_TEXT);
                else
                    pass.setText("458888");
            }
        });
        switcher.setOnHoverListener(new View.OnHoverListener(){
            @Override
            public boolean onHover(View v, MotionEvent ev){
                Toast.makeText(MainActivity.this,"jjj",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
