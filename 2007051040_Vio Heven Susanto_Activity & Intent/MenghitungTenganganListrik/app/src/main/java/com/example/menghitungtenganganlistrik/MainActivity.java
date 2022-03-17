package com.example.menghitungtenganganlistrik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button home ;
    private EditText etArus ;
    private EditText etHambatan ;
    private TextView tvTegangan ;
    private Button btnHitung ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();

        home = findViewById(R.id.btnCari) ;

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Home.class) ;
                startActivities(new Intent[]{pindah});
            }
        });
    }

    private void initEvent() {
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HitungTegangan();
            }
        });

    }

    private void HitungTegangan() {
        int Arus =Integer.parseInt(etArus.getText().toString());
        int Hambatan =Integer.parseInt(etHambatan.getText().toString());
        int Tegangan = Arus * Hambatan ;
        tvTegangan.setText("Besar Tegangan Listriknya adalah = " +Tegangan + "Volt");
    }

    private void initUI() {
        etArus =(EditText) findViewById(R.id.etArus) ;
        etHambatan =(EditText) findViewById(R.id.etHambatan);
        tvTegangan =(TextView) findViewById(R.id.tvTegangan);
        btnHitung =(Button) findViewById(R.id.btnHitung);

    }
}
