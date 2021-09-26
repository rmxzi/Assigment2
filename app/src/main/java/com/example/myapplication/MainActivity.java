package com.example.myapplication;

import static android.view.View.OnClickListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    Button btnClickHere;
    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText)findViewById(R.id.editTextName);
        btnClickHere=(Button)findViewById(R.id.btnClickHere) ;
        textName=(TextView)findViewById(R.id.textName);
        btnClickHere.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editTextName.getText().toString();
                textName.setText("Hi "+name);
            }
        });
    }

}