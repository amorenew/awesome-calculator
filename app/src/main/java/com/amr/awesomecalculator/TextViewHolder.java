package com.amr.awesomecalculator;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class TextViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    TextViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.text);
    }
}
