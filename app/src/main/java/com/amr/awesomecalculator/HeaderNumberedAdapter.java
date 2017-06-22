package com.amr.awesomecalculator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

class HeaderNumberedAdapter extends RecyclerView.Adapter<TextViewHolder> {
    private static final int ITEM_VIEW_TYPE_HEADER = 0;
    private static final int ITEM_VIEW_TYPE_ITEM = 1;

    //    private View header;
    private final List<String> labels;

    HeaderNumberedAdapter(int count) {
//        if (header == null) {
////            throw new IllegalArgumentException("header may not be null");
//        }
//        this.header = header;
        this.labels = new ArrayList<String>(count);
        for (int i = 0; i < count; ++i) {
            if (i == 0) {
                labels.add(String.valueOf(7));
            }
            if (i == 1) {
                labels.add(String.valueOf(8));
            }
            if (i == 2) {
                labels.add(String.valueOf(9));
            }
            if (i == 3) {
                labels.add("Del");
            }
            if (i == 4) {
                labels.add("His");
            }
            if (i == 5) {
                labels.add(String.valueOf(4));
            }
            if (i == 6) {
                labels.add(String.valueOf(5));
            }
            if (i == 7) {
                labels.add(String.valueOf(6));
            }
            if (i == 8) {
                labels.add("X");
            }
            if (i == 9) {
                labels.add("÷");
            }
            if (i == 10) {
                labels.add(String.valueOf(1));
            }
            if (i == 11) {
                labels.add(String.valueOf(2));
            }
            if (i == 12) {
                labels.add(String.valueOf(3));
            }
            if (i == 13) {
                labels.add("-");
            }
            if (i == 14) {
                labels.add("=");
            }
            if (i == 15) {
                labels.add("%");
            }
            if (i == 16) {
                labels.add("0");
            }
            if (i == 17) {
                labels.add(".");
            }
            if (i == 18) {
                labels.add("+");
            }
            if (i == 20) {
                labels.add("(");
            }
            if (i == 21) {
                labels.add(")");
            }
            if (i == 22) {
                labels.add("ln");
            }
            if (i == 23) {
                labels.add("∏");
            }
            if (i == 24) {
                labels.add("е");
            }
            if (i == 25) {
                labels.add("sin");
            }
            if (i == 26) {
                labels.add("cos");
            }
            if (i == 27) {
                labels.add("tan");
            }
            if (i == 28) {
                labels.add("log");
            }
            if (i == 29) {
                labels.add("√x");
            }
            if (i == 30) {
                labels.add("sin⁻¹");
            }
            if (i == 31) {
                labels.add("cos⁻¹");
            }
            if (i == 32) {
                labels.add("tan⁻¹");
            }
            if (i == 33) {
                labels.add("log2");
            }
            if (i == 34) {
                labels.add("³√x");
            }
        }
    }

    boolean isHeader(int position) {
        return position == 0;
    }


    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_VIEW_TYPE_HEADER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header, parent, false);
            return new TextViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new TextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TextViewHolder holder, final int position) {
        if (isHeader(position)) {
            return;
        }
        final String label = labels.get(position - 1);  // Subtract 1 for header
        holder.textView.setText(label);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        holder.textView.getContext(), label, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        return isHeader(position) ? ITEM_VIEW_TYPE_HEADER : ITEM_VIEW_TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return labels.size() + 1;
    }
}