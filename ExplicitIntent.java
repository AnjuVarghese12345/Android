package com.example.demoexpliintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
            public void callSecondActivity(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("Value1","First page");
                startActivity(i);
                Toast.makeText(this, "This is second page", Toast.LENGTH_SHORT).show();
            }
    }




package com.example.demoexpliintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras=getIntent().getExtras();
        String value1=extras.getString("Value1");
        Toast.makeText(getApplicationContext(), "First::"+value1, Toast.LENGTH_SHORT).show();
    }
    public void callFirstActivity(View view){
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
