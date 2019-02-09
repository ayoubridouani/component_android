package com.example.anonsurf.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listV = findViewById(R.id.listV);

        String items[] = {
                "Camera",
                "Video",
                "Television",
                "Micro"
        };
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        //final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.design,R.id.design,items);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.listV,android.R.layout.simple_list_item_1);
        listV.setAdapter(adapter);

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),adapter.getItem(position),Toast.LENGTH_SHORT).show();
                view.setSelected(true);
            }
        });

    }
}
