package com.example.dewilematangdestinasiwisatalampungselatan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


public class WisataAlam extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{
                "Pantai Minang Rua", "Grand Elty Krakatau", "Air Panas Way Belerang", "Air Terjun Way Kalam", "Pulau Mengkudu", "Pantai Sebalang",
                "Pantai Alau-Alau", "Pantai Tapak Kera", "Pantai Marina"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), MinangRua.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), GrandElty.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), AirPanas.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), AirTerjun.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position ==4) {
                    Intent myIntent = new Intent(view.getContext(),PulauMengkudu.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position ==5) {
                    Intent myIntent = new Intent(view.getContext(),PantaiSebalang.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position ==6) {
                    Intent myIntent = new Intent(view.getContext(),AlauAlau.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position ==7) {
                    Intent myIntent = new Intent(view.getContext(),TapakKera.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position ==8) {
                    Intent myIntent = new Intent(view.getContext(),PantaiMariana.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}