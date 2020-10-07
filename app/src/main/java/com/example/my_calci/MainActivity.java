package com.example.my_calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btndot,  btnequal, btnadd, btnsub, btnmul, btndiv;
    EditText etOutput;
    boolean addition, subtract, multiply, divide;
    Float FirstVal, SecondVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btndot = findViewById(R.id.btndot);
        btnC = findViewById(R.id.btnC);
        btnequal = findViewById(R.id.btnequal);

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnmin);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        etOutput = findViewById(R.id.etOutput);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+"0");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText("");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOutput.setText(etOutput.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstVal = Float.parseFloat(etOutput.getText()+" ");
                addition = true;
                etOutput.setText(null);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstVal = Float.parseFloat(etOutput.getText()+" ");
                subtract = true;
                etOutput.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstVal = Float.parseFloat(etOutput.getText()+" ");
                multiply = true;
                etOutput.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstVal = Float.parseFloat(etOutput.getText()+" ");
                divide = true;
                etOutput.setText(null);
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondVal = Float.parseFloat(etOutput.getText()+" ");
                if(addition==true){
                    etOutput.setText(FirstVal+SecondVal+"");
                    addition=false;
                }if(subtract==true){
                    etOutput.setText(FirstVal-SecondVal +"");
                    subtract=false;
                }if (multiply==true){
                    etOutput.setText(FirstVal*SecondVal +"");
                    multiply=false;
                }if(divide==true){
                    etOutput.setText(FirstVal/SecondVal +"");
                    divide=false;

                }
            }
        });
    }
}
