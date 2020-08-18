package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTextNo1 , editTextNo2;
    public Button btn_sum , btn_minus , btn_multiplication , btn_division ;
    TextView textResult ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextNo1 =(EditText)findViewById(R.id.editTextNo1);
        editTextNo1.setText(getIntent().getStringExtra("No1"));

        editTextNo2 =(EditText)findViewById(R.id.editTextNo2);
        editTextNo2.setText(getIntent().getStringExtra("No2"));

        textResult = (TextView)findViewById(R.id.textResult);

        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int No1 = Integer.parseInt(getIntent().getStringExtra("No1"));
                int No2 = Integer.parseInt(getIntent().getStringExtra("No2"));

                int sum = No1 + No2 ;

                textResult.setText(getIntent().getStringExtra("No1")+" + "+getIntent().getStringExtra("No2")+" = "+String.valueOf(sum));

            }
        });
        btn_minus =(Button)findViewById(R.id.btn_minus);
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int No1 = Integer.parseInt(getIntent().getStringExtra("No1"));
                int No2 = Integer.parseInt(getIntent().getStringExtra("No2"));

                int minus = No1 - No2 ;

                textResult.setText(getIntent().getStringExtra("No1")+" - "+getIntent().getStringExtra("No2")+" = "+String.valueOf(minus));


            }
        });
        btn_multiplication =(Button)findViewById(R.id.btn_multiplication);
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int No1 = Integer.parseInt(getIntent().getStringExtra("No1"));
                int No2 = Integer.parseInt(getIntent().getStringExtra("No2"));

                int multiplication = No1 * No2 ;

                textResult.setText(getIntent().getStringExtra("No1")+" * "+getIntent().getStringExtra("No2")+" = "+String.valueOf(multiplication));

            }
        });
        btn_division = (Button)findViewById(R.id.btn_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int No1 = Integer.parseInt(getIntent().getStringExtra("No1"));
                int No2 = Integer.parseInt(getIntent().getStringExtra("No2"));

                int division = No1 / No2 ;

                textResult.setText(getIntent().getStringExtra("No1")+" / "+getIntent().getStringExtra("No2")+" = "+String.valueOf(division));

            }
        });



    }
}