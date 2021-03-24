package com.anugrah.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText NilaiA,NilaiB;
    Button tambah,kurang,kali,bagi;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NilaiA = (EditText) findViewById(R.id.NilaiA);
        NilaiB = (EditText) findViewById(R.id.NilaiB);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        Hasil = (TextView) findViewById(R.id.Hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(NilaiA.getText().toString());
                int nilaiB = Integer.parseInt(NilaiB.getText().toString());
                int hasil = nilaiA + nilaiB;
                Hasil.setText(String.valueOf(hasil));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(NilaiA.getText().toString());
                int nilaiB = Integer.parseInt(NilaiB.getText().toString());
                int hasil = nilaiA - nilaiB;
                Hasil.setText(String.valueOf(hasil));
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(NilaiA.getText().toString());
                int nilaiB = Integer.parseInt(NilaiB.getText().toString());
                int hasil = nilaiA * nilaiB;
                Hasil.setText(String.valueOf(hasil));
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(NilaiA.getText().toString());
                int nilaiB = Integer.parseInt(NilaiB.getText().toString());
                int hasil = nilaiA / nilaiB;
                Hasil.setText(String.valueOf(hasil));
            }
        });
    }
}