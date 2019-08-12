package com.lucifer.hell;

import android.view.View;
import android.view.ViewGroup;
import android.view.viewgroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class RecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerView.recyclerItem> {

    @NonNull
    @Override
    public recyclerItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerItem holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class recyclerItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        public recyclerItem(@NonNull View itemView) {
            super(itemView);
        }
    }
}
