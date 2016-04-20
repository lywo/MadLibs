package com.example.lydia.madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_v);

        String stories [] = {"simple", "tarzan", "university", "clothes", "dance"};

        ListAdapter theAdapter = new ArrayAdapter<String>(this, R.layout.row_layout, stories);

        ListView theListView = (ListView) findViewById(R.id.listStories); 
    }
}
