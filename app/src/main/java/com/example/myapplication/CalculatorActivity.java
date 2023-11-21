package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        Button btn = (Button) findViewById(R.id.btn);
        TextView result = (TextView) findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1_data = number1.getText().toString();
                String number2_data = number2.getText().toString();

                if (number1_data.equals("")){

                    result.setText("عدد اول را وارد کنید");
                    return;
                }
                if (number2_data.equals("")){

                    result.setText("عدد دوم را وارد کنید");
                    return;
                }
                int x1=Integer.parseInt(number1_data);
                int x2=Integer.parseInt(number2_data);
                int btn=x1+x2;
                result.setText(btn+"   ");
            }
        });

        }
    }
