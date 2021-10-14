package com.example.acmsession1assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView newtext;
    private EditText details_text;
    private Button clickbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newtext = findViewById(R.id.name_tv);
        details_text= findViewById(R.id.name_text);
        clickbutton = findViewById(R.id.button);

        clickbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.acmsession1assignment.MainActivity.this,"Hello to my app");
            }

            )}
}

