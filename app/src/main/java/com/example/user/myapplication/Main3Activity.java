package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    public String [] m = {"1","2","3","4","5"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ArrayAdapter aa = new ArrayAdapter<String>(this, R.layout.activity_main3, m);
        ListView lw = (ListView) findViewById(R.id.list);
        lw.setAdapter(aa);
    }
}
