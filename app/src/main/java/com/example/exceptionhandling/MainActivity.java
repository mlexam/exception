package com.example.exceptionhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview= findViewById(R.id.textview);

        try {
            int a=0;
            int b=0;
            int c= a/b;
            textview.setText("0/0="+c);
            Toast.makeText(getApplicationContext(), "The value is : "+a, Toast.LENGTH_LONG).show();


        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"the caught exception is"+e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}