package com.fbg.android.dev.mycard.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fbg.android.dev.mycard.R;
import com.fbg.android.dev.mycard.activity.CardDetailActivity;

/**
 * Created by fran on 08-09-16.
 */

public class MyCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvMainText;
    public TextView tvSubText;
    public CardView cardView;
    public TextView tvEmail;
    public TextView tvWeb;
    public Context context;

    public MyCardViewHolder(View view) {
        super(view);

        tvMainText = (TextView) view.findViewById(R.id.tvMainText);
        tvSubText = (TextView) view.findViewById(R.id.tvSubText);

        tvEmail = (TextView) view.findViewById(R.id.tvEmail);
        tvWeb = (TextView) view.findViewById(R.id.tvWeb);

        context = view.getContext();

        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.card) {
            context.startActivity(new Intent(context, CardDetailActivity.class));
        }
    }
}
