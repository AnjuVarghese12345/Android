package com.example.demoradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RadioHandler(View view)
    {
        boolean selected=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.m:
                if(selected)
                    Toast.makeText(MainActivity.this,"Male selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.f:
                if(selected)
                Toast.makeText(MainActivity.this,"Female selected",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
