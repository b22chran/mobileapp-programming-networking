package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private List<Mountain> listOfBerg;
        private LayoutInflater layoutInflater;
        private OnClickListener onClickListener;

        RecyclerViewAdapter(Context context, List<Mountain> listOfBerg, OnClickListener onClickListener) {
            this.layoutInflater = LayoutInflater.from(context);
            this.listOfBerg = listOfBerg;
            this.onClickListener = onClickListener;
        }


        @Override
        @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(layoutInflater.inflate(R.layout.activity_item, parent, false));

        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.title.setText(listOfBerg.get(position).toString());
        }

        @Override
        public int getItemCount() {
            return listOfBerg.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView title;

            ViewHolder(View itemView) {
                super(itemView);
                itemView.setOnClickListener(this);
                title = itemView.findViewById(R.id.title);
            }

            @Override
            public void onClick(View view) {
                onClickListener.onClick(listOfBerg.get(getAdapterPosition()));
            }
        }

        public interface OnClickListener {
            void onClick(Mountain item);
        }
    }