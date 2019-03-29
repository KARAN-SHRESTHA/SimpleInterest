package com.example.simpleinterest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText etPrice, etRate, etTime, etNumber, etArea;
    private Button btnCalculate, btnSquare, btnArea;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etPrice = findViewById(R.id.etPrice);
        etRate = findViewById(R.id.etRate);
        etTime = findViewById(R.id.etTime);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvOutput = findViewById(R.id.tvOutput);

        etNumber = findViewById(R.id.etNumber);
        btnSquare = findViewById(R.id.btnSquare);

        etArea = findViewById(R.id.etArea);
        btnArea = findViewById(R.id.btnArea);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {


                                                if(!Validationn())
                                                {
                                                    tvOutput.setText("ERROR");
                                                    return;
                                                }


                                                float Price = Float.parseFloat(etPrice.getText().toString());
                                                float Rate = Float.parseFloat(etRate.getText().toString());
                                                float Time = Float.parseFloat(etTime.getText().toString());
                                                //int sum = first + second;


                                                SI si = new SI();

                                                si.setPrice(Price);
                                                si.setRate(Rate);
                                                si.setTime(Time);

                                                float total = si.Calc();

                                                tvOutput.setText(Float.toString(total));

                                            }
                                        }
        );


        btnSquare.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             int Squares = Integer.parseInt(etNumber.getText().toString());

                                             Square s = new Square();

                                             s.setNumber(Squares);

                                             int ss = s.Square();

                                             etNumber.setText(Integer.toString(ss));


                                         }
                                     }

        );


        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Areas = Double.parseDouble(etArea.getText().toString());

                Area a = new Area();

                a.setNumber(Areas);

                double aa = a.Areaa();

                etArea.setText(Double.toString(aa));


            }
        });




    }
    public boolean Validationn ()
    {

        boolean flag = true;
        if (etPrice.getText().toString().isEmpty()) {
            etPrice.setError("Enter Price");
            etPrice.requestFocus();
        } else if (etTime.getText().toString().isEmpty()) {
            etTime.setError("Enter Time");
        } else if (etRate.getText().toString().isEmpty()) {
            etRate.setError("Enter Rate");
        }

        return flag;
    }
}
