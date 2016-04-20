package com.example.lydia.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Intent listViewAction = new Intent(this, ListVActivity.class);

    protected void onClickHandler(){
        startActivity(listViewAction);
    }
}
