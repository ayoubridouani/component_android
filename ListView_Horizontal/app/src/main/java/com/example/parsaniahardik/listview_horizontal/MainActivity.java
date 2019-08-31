package com.example.parsaniahardik.listview_horizontal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private HorizontalListView horizontalListView;
    private HorizontalAdapter customeAdapter;
    private ArrayList<Model> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.benz, R.drawable.bike,
            R.drawable.car,R.drawable.carrera
            ,R.drawable.ferrari,R.drawable.harly,
            R.drawable.lamborghini,R.drawable.silver};
    private String[] myImageNameList = new String[]{"Benz", "Bike",
            "Car","Carrera"
            ,"Ferrari","Harly",
            "Lamborghini","Silver"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalListView = findViewById(R.id.HorizontalListView);

        imageModelArrayList = populateData();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customeAdapter = new HorizontalAdapter(this,imageModelArrayList);
        horizontalListView.setAdapter(customeAdapter);

    }

    private ArrayList<Model> populateData(){

        ArrayList<Model> list = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            Model imageModel = new Model();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }
}
