package com.example.student.squarethenumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculate(View view ){
        //Get input and output controls
        EditText input =(EditText) findViewById(R.id.editText );
        TextView output =(TextView) findViewById(R.id.textViewoutput);
        //process data..
        int base=Integer.valueOf(input.getText().toString());
        int result=base*base;
        String formatedResult=String.format("%d",result);
        //output the result
        output.setText("Result:"+ formatedResult);


    }
}
