package com.example.pwpb9_menghitungluas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    EditText vTxtA, vTxtB, vTxtC;

    protected float yTxtA, yTxtB, yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        vTxtA = findViewById(R.id.txtA);
        vTxtB = findViewById(R.id.txtB);
        vTxtC = findViewById(R.id.txtC);

        Button vBtnTambah = findViewById(R.id.btnTambah);
        Button vBtnKurang = findViewById(R.id.btnKurang);
        Button vBtnKali = findViewById(R.id.btnKali);
        Button vBtnBagi = findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        yTxtA = Float.parseFloat(vTxtA.getText().toString());
        yTxtB = Float.parseFloat(vTxtB.getText().toString());

        switch (view.getId()) {
            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;
        }
    }
}
