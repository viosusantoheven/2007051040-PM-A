package com.example.dewilematangdestinasiwisatalampungselatan;

import android.os.Bundle;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class WisataEdukasi extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_edukasi);

        listView = (ListView) findViewById(R.id.list1);
        String[] values = new String[]{
                "Kebun Edukasi Kalianda", "Wisata Edukasi Lampung Selatan"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), kebun_edukasi.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Wisataedukasilampsel.class);
                    startActivityForResult(myIntent, 0);
                }
            }


        });
    }
}