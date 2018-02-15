package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonpush(View view){
        Intent intent = new Intent (this, Main2Activity.class);
       // sendMessage(view);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void sendMessage(View view) {
        //Код с сохранением и отправкой кода из Login и Password
       /* Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String login = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, login);

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String password = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, password);
        startActivity(intent);*/
    }

}
