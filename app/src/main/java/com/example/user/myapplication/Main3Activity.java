package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    public String [] m = {"1","2","3","4","5"};
    int[] IMAGES = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5};
    public String[] DESCRIPTIONS ={"Hello","There",",","Help me","me please"};
    public void buttonpush(View view){
        Intent intent = new Intent (this, ResultsActivity.class);
        startActivity(intent);

    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView lw = (ListView) findViewById(R.id.list);
        //CustomAdapter customAdapter=new CustomAdapter();
        //lw.setAdapter(customAdapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item_my, R.id.label, m);
        lw.setAdapter(adapter);


        /*ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,m);
        lw.setAdapter(arrayAdapter);
        lw.setOnItemClickListener(this);*/
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView tv=(TextView)view;
        Toast.makeText(this,"Vlad"+tv.getText()+i, Toast.LENGTH_SHORT).show();
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {

            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            TextView textView_m = (TextView)view.findViewById(R.id.textView_m);
            TextView textView_desriptions = (TextView) view.findViewById(R.id.textView_discription);
            imageView.setImageResource(IMAGES[i]);
            textView_m.setText(m[i]);
            textView_desriptions.setText(DESCRIPTIONS[i]);



            return view;
        }
    }
}
