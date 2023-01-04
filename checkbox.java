package com.example.democheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkSelect(View view)
    {
        boolean checked= ((CheckBox)view).isChecked();
        switch(view.getId())
        {
            case R.id.c1:
                if(checked)
                    Toast.makeText(MainActivity.this,"Eng selected",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Eng deselected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.c2:
                if(checked)
                    Toast.makeText(MainActivity.this,"Mal selected",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Mal deselected",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
