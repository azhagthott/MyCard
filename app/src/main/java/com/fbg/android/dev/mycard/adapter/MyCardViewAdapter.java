package com.fbg.android.dev.mycard.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fbg.android.dev.mycard.base.Card;
import com.fbg.android.dev.mycard.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fran on 10-09-16.
 */

public class MyCardViewAdapter extends RecyclerView.Adapter<MyCardViewHolder> {

    private List<Card> cards;

    public MyCardViewAdapter(List<Card> cards) {
        this.cards = new ArrayList<>();
        this.cards = cards;
    }

    @Override
    public MyCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_front, parent, false);
        return new MyCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyCardViewHolder holder, int i) {

        Card card = cards.get(i);
        holder.tvMainText.setText(card.getMainText());
        holder.tvSubText.setText(card.getSubText());

        holder.tvEmail.setText(card.getEmail());
        holder.tvWeb.setText(card.getWeb());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
