package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityhello);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.button2);
        textView.setText(message);

        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        TextView textView1 = findViewById(R.id.textView);
        textView1.setText(message1);
    }



    public void Go (View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}
