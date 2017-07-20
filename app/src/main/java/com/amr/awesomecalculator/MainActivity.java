package com.amr.awesomecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCalcButtons;
    private ArrayList<String> Data;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] text = new String[]{
                "7", "8", "9", "Del", "this", "4", "5", "6", "*", "/",
                "1", "2", "3", "+", "-", "=", "0", ".", "%", "e",
                "(", ")", "ln", "pi", "7", "7", "7", "7", "7", "7",
                "7", "7", "7", "7", "7"
        };

        rvCalcButtons = (RecyclerView) findViewById(R.id.rvCalcButtons);
        Data = new ArrayList<>(Arrays.asList(text));
        adapter = new Adapter(getApplicationContext(), Data);
        rvCalcButtons.setAdapter(adapter);
        rvCalcButtons.setLayoutManager(new GridLayoutManager(getApplicationContext(), 5));


    }
}
