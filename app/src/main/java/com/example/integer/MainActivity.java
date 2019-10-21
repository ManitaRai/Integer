package com.example.integer;




        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText firstNum, secondNum;
    Button btnAdd, btnSub, btnMulti, btnDiv;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNumber);
        secondNum =findViewById(R.id.secondNumber);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub= findViewById(R.id.btnSubtract);
        btnMulti=findViewById(R.id.btnMultiply);
        btnDiv =findViewById(R.id.btnDivide);
        textView = findViewById(R.id.textView);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a = Integer.parseInt(firstNum.getText().toString());
//                int b = Integer.parseInt(secondNum.getText().toString());
//                int c = a+b;
//                textView.setText("Result:"+ String.valueOf(c));
//            }
//        });
//
//        btnSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int x = Integer.parseInt(firstNum.getText().toString());
//                int y = Integer.parseInt(secondNum.getText().toString());
//                int z = x-y;
//                textView.setText("Result:"+ String.valueOf(z));
//            }
//        });
//        btnMulti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int i = Integer.parseInt(firstNum.getText().toString());
//                int j = Integer.parseInt(secondNum.getText().toString());
//                int k = i*j;
//                textView.setText("Result:"+ String.valueOf(k));
//            }
//        });
//        btnDiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int p = Integer.parseInt(firstNum.getText().toString());
//                int q = Integer.parseInt(secondNum.getText().toString());
//                int r = p/q;
//                textView.setText("Result:"+ String.valueOf(r));
//            }
//        });

    }

    @Override
   public void onClick(View view) {
        if(view.getId() == R.id.btnAdd){
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a+b;
            textView.setText("Result:"+ String.valueOf(c));
        }

        if(view.getId() == R.id.btnSubtract){
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a-b;
            textView.setText("Result:"+ String.valueOf(c));
        }

        if(view.getId() == R.id.btnMultiply){
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a*b;
            textView.setText("Result:"+ String.valueOf(c));

        }
        if(view.getId() == R.id.btnDivide){
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a/b;
            textView.setText("Result:"+ String.valueOf(c));

        }
    }

}
