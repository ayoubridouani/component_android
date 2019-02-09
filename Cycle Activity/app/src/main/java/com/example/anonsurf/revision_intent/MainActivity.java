package com.example.anonsurf.revision_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"create",Toast.LENGTH_LONG).show();
       // Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:06169121111"));
        //startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"destroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"start",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"restart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"stop",Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Toast.makeText(this,Integer.toString(keyCode),Toast.LENGTH_LONG).show();

        return super.onKeyUp(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this,"Back Pressed",Toast.LENGTH_LONG).show();
    }

    /*@Override
    public String getPackageName() {
        return super.getPackageName();
    }*/
}
