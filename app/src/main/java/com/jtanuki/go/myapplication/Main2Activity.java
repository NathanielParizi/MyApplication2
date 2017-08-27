package com.jtanuki.go.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle extras = getIntent().getExtras();
           showMessage = (TextView) findViewById(R.id.textView2);



        // check if null
        if( extras != null)
        {

            String message = extras.getString("New data");
            int myInt = extras.getInt("value");
            showMessage.setText(String.valueOf(myInt));

        }
    }
}
