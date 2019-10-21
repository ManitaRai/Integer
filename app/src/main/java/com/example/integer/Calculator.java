package com.example.integer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class Calculator extends AppCompatActivity {
    Button   Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn0,BtnAdd,BtnSub,BtnMulti,BtnDiv,BtnEqual,BtnClear;
    EditText  Putnum;
    float num1, num2;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);


        Btn0 = (Button) findViewById(R.id.btn0);
        Btn1 = (Button) findViewById(R.id.btn1);
        Btn2 = (Button) findViewById(R.id.btn2);
        Btn3 = (Button) findViewById(R.id.btn3);
        Btn4 = (Button) findViewById(R.id.btn4);
        Btn5 = (Button) findViewById(R.id.btn5);
        Btn6 = (Button) findViewById(R.id.btn6);
        Btn7 = (Button) findViewById(R.id.btn7);
        Btn8 = (Button) findViewById(R.id.btn8);
        Btn9 = (Button) findViewById(R.id.btn9);
        BtnAdd = (Button) findViewById(R.id.btnAdd);
        BtnSub = (Button) findViewById(R.id.btnSub);
        BtnMulti = (Button) findViewById(R.id.btnMulti);
        BtnDiv = (Button) findViewById(R.id.btnDiv);
        BtnEqual = (Button) findViewById(R.id.btnEqual);
        BtnClear = (Button) findViewById(R.id.btnClear);
        Putnum = (EditText) findViewById(R.id.ans);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "1");
            }
        });


        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "2");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "3");
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "4");
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "5");
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "6");
            }
        });

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "7");
            }
        });

        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "8");
            }
        });

        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "9");
            }
        });

        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText(Putnum.getText() + "0");
            }
        });

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Putnum== null){
                    Putnum.setText("");
                }
                else{

                    num1 = Float.parseFloat(Putnum.getText() + "");
                    Addition = true;
                    Putnum.setText(null);

                }
            }});

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Putnum == null){
                    Putnum.setText("");
                }
                else{

                    num1 = Float.parseFloat(Putnum.getText() + "");
                    Subtract = true;
                    Putnum.setText(null);

                }
            }});

        BtnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Putnum == null){
                    Putnum.setText("");
                }
                else{

                    num1 = Float.parseFloat(Putnum.getText() + "");
                    Multiplication = true;
                    Putnum.setText(null);

                }
            }});

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Putnum== null){
                    Putnum.setText("");
                }
                else{

                    num1 = Float.parseFloat(Putnum.getText() + "");
                    Division = true;
                    Putnum.setText(null);

                }
            }});


        BtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(Putnum.getText() + "");
                if (Addition == true) {
                    Putnum.setText(num1 + num2 + "");
                    Addition = false;

                }


                if (Subtract == true) {
                    Putnum.setText(num1 - num2 + "");
                    Subtract = false;
                }



                if (Multiplication == true) {
                    Putnum.setText(num1 * num2 + "");

                    Multiplication = false;
                }



                if (Division == true) {
                    Putnum.setText(num1 / num2 + "");
                    Division = false;
                }
            }});


        BtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Putnum.setText("");
            }
        });




    }
}
