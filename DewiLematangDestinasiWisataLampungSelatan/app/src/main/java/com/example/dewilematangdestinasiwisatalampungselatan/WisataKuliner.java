package com.example.dewilematangdestinasiwisatalampungselatan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class WisataKuliner extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        listView = (ListView) findViewById(R.id.list1);
        String[] values = new String[]{
                "Otak Otak Hj. Mastupah", "Otak Otak Kalianda "
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), otakotakkalianda.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(),otakotakkalianda1.class);
                    startActivityForResult(myIntent, 0);
                }
            }


        });
    }
}

