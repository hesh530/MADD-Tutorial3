package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView rs;
    EditText n1,n2;

    float result;
    int num1, num2;
    String takeExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent cal = new Intent();
        takeExtra = cal.getStringExtra("MAIN_EXTRA");

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

        rs = findViewById(R.id.results);

        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                //addition
                result = num1 + num2;

                rs.setText(String.valueOf(result));

            }
        });

        //
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 - num2;

                rs.setText(String.valueOf(result));

            }
        });

        //multiply
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 * num2;

                rs.setText(String.valueOf(result));
            }
        });

        //division
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 / num2;

                rs.setText(String.valueOf(result));
            }
        });
    }
}