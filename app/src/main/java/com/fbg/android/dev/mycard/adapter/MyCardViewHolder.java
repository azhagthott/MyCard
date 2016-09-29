package com.fbg.android.dev.mycard.adapter;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fbg.android.dev.mycard.R;
import com.fbg.android.dev.mycard.activity.CardEditModeActivity;

/**
 * Created by fran on 08-09-16.
 */

public class MyCardViewHolder extends RecyclerView.ViewHolder
        implements View.OnLongClickListener, View.OnClickListener {

    public TextView tvMainText;
    public TextView tvSubText;
    public TextView tvEmail;
    public TextView tvWeb;
    public Context context;

    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetLeftIn;
    private boolean mIsBackVisible = false;
    private View mCardFrontLayout;
    private View mCardBackLayout;

    public MyCardViewHolder(View view) {
        super(view);

        tvMainText = (TextView) view.findViewById(R.id.tvMainText);
        tvSubText = (TextView) view.findViewById(R.id.tvSubText);

        tvEmail = (TextView) view.findViewById(R.id.tvEmail);
        tvWeb = (TextView) view.findViewById(R.id.tvWeb);

        context = view.getContext();

        view.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View view) {

        if (view.getId() == R.id.card_front) {
            context.startActivity(new Intent(context, CardEditModeActivity.class));
        }
        return true;
    }

    @Override
    public void onClick(View view) {

    }
}
