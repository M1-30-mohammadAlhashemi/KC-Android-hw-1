package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText quiz = findViewById(R.id.editText1);
        EditText hw = findViewById(R.id.homework);
        EditText mid = findViewById(R.id.midterms);
        EditText finals = findViewById(R.id.edittext3);
           Button cal = findViewById(R.id.button);
           Button rest = findViewById(R.id.button2);
        TextView total = findViewById(R.id.result);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int q = Integer.parseInt(quiz.getText().toString());
                int h = Integer.parseInt(hw.getText().toString());
                int m = Integer.parseInt(mid.getText().toString());
                int f = Integer.parseInt(finals.getText().toString());
                int add = q+h+m+f;
                total.setText(String.valueOf(add));

                if (add>100){
                    total.setText("wrong numbers");
                    total.setTextColor(Color.parseColor("#FFE41E0F"));
                    Toast.makeText(MainActivity.this,"try again",Toast.LENGTH_SHORT).show();
                }

            }
        });

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quiz.setText("");
                hw.setText("");
                mid.setText("");
                finals.setText("");
                total.setText("Result");
                total.setTextColor(Color.parseColor("#FF4D5E65"));

            }
        });

    }
}