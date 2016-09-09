package com.fbg.android.dev.mycard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fran on 08-09-16.
 */

public class MyCardViewAdapter extends RecyclerView.Adapter<MyCardViewAdapter> {

    private List<Card> cards;


    @Override
    public MyCardViewAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        this.cards = new ArrayList<>();
        this.cards.addAll(cards);
    }

    @Override
    public void onBindViewHolder(MyCardViewAdapter holder, int position) {



    }

    @Override
    public int getItemCount() {
        return cards.size();

    }
}
