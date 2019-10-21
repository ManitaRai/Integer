package com.example.integer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Form extends AppCompatActivity {
    EditText editText;
    RadioButton rbM, rbf, rbO;
    Spinner spinner;
    CheckBox cbM, cbT, cbD;
    Button button;

     String name, gender, pradesh ;
    String[] hob=new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editText = findViewById(R.id.edit1);
        rbM = findViewById(R.id.rbmale);
        rbf = findViewById(R.id.rbFemale);
        rbO = findViewById(R.id.Other);
        spinner = findViewById(R.id.spnPradesh);
        cbM = findViewById(R.id.cbMusic);
        cbT = findViewById(R.id.CbTravel);
        cbD = findViewById(R.id.Dance);
        button = findViewById(R.id.btnSubmit);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                pradesh=  adapterView.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Form.this,
                        "Select One",
                        Toast.LENGTH_SHORT).show();

            }

        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=editText.getText().toString();
                Intent intent= new Intent(Form.this,Regdata.class);
                intent.putExtra("name",name);
                intent.putExtra("pradesh",pradesh);
                intent.putExtra("hob",hob);
                startActivity(intent);





            }
        });

        cbD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(Form.this, "", Toast.LENGTH_SHORT).show();
                    hob[0]=cbD.getText().toString();
                } else {
                    Toast.makeText(Form.this, "", Toast.LENGTH_SHORT).show();
                    hob[0]="";
                }

            }
        });



    }
    private void  onCbSelect(){
        cbM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {

                    Toast.makeText(Form.this, "", Toast.LENGTH_SHORT).show();
                    hob[0]=cbM.getText().toString();

                }
                else{

                    hob[0]="";
                }
            }
        });



    }
}

