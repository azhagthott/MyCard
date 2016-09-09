package com.fbg.android.dev.mycard;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by fran on 08-09-16.
 */

public class MyCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView mainText;
    private TextView subText;

    public MyCardViewHolder(View view) {
        super(view);
    }

    @Override
    public void onClick(View view) {

    }
}
