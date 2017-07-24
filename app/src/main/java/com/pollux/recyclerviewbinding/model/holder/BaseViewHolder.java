package com.pollux.recyclerviewbinding.model.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by sreekumar on 7/24/17.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T object);
}
