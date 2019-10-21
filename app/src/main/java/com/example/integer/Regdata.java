package com.example.integer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Regdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regdata);
        
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String pradesh=intent.getStringExtra("pradesh");
        String[]hob=intent.getStringArrayExtra("hob");

        Toast.makeText(this, name+pradesh+hob[0]+hob[1]+hob[2],
                Toast.LENGTH_SHORT).show();

        
    }
}
