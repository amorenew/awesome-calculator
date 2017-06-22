package com.amr.awesomecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCalcButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCalcButtons = (RecyclerView) findViewById(R.id.rvCalcButtons);
        rvCalcButtons.addItemDecoration(new MarginDecoration(this));
        rvCalcButtons.setHasFixedSize(true);

        final HeaderNumberedAdapter adapter = new HeaderNumberedAdapter(35);
        rvCalcButtons.setAdapter(adapter);

        SpannedGridLayoutManager manager2 = new SpannedGridLayoutManager(
                new SpannedGridLayoutManager.GridSpanLookup() {
                    @Override
                    public SpannedGridLayoutManager.SpanInfo getSpanInfo(int position) {
                        if (adapter.isHeader(position)) {

                            return new SpannedGridLayoutManager.SpanInfo(5, 1);
                        }
                        if (position == 15) {
                            return new SpannedGridLayoutManager.SpanInfo(1, 2);
                        }
                        return new SpannedGridLayoutManager.SpanInfo(1, 1);
                    }
                },
                5, // number of columns
                1f // how big is default item
        );
        rvCalcButtons.setLayoutManager(manager2);
        rvCalcButtons.setHasFixedSize(true);

        View header = LayoutInflater.from(this).inflate(
                R.layout.header, rvCalcButtons, false);
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "header",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
