package com.example.exe2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText eu =findViewById(R.id.r1);
        EditText ep =findViewById(R.id.r2);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener((View v) -> {
            if(eu.getText().toString().equals("admin") && ep.getText().toString().equals("admin") ){
              Toast.makeText(MainActivity.this, "Valid User", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_LONG).show();
            }
        });
    }
}
