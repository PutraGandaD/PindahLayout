package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    TextView tvWelcome;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home");

        tvWelcome = findViewById(R.id.tv_welcome);
        btnPindah = findViewById(R.id.btn_pindah);
        etNama = findViewById(R.id.et_nama);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etNama.getText().toString();

                if (Nama.trim().equals("")) {
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else {
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    pindah.putExtra("inputNama", Nama);
                    startActivity(pindah);
                }
            }
        });
    }
}