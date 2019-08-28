package com.example.pwpb9_menghitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang,edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi");

        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        txtLuas = findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString();
                String lebar = edtLebar.getText().toString();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas =p * l;

                txtLuas.setText("Luas = " + luas);
            }
        });

    }
}
