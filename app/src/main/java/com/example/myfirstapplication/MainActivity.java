package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Name;
    TextView inputName;
    TextView display;
    Button clickme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (TextView) findViewById(R.id.txtName);
        inputName = (TextView) findViewById(R.id.txtinputName);
        display = (TextView) findViewById(R.id.txtDisplay);
        clickme = (Button) findViewById(R.id.btnClickme);

        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = inputName.getText().toString();
                display.setText( "Hello " + myValue + "!");
            }
        });
    }
}