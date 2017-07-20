package com.amr.awesomecalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Owner on 7/20/2017.
 */

public class Adapter extends RecyclerView.Adapter<TextViewHolder> {

    private Context context;
    private ArrayList<String> Data;
    private LayoutInflater inflater;

    public Adapter(Context context, ArrayList<String> data) {
        this.context = context;
        Data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        TextViewHolder viewHolder = new TextViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, int position) {

        holder.textView.setText(Data.get(position));

    }

    @Override
    public int getItemCount() {
        return Data.size();
    }
}
