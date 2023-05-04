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

        RecyclerViewAdapter(Context context, List<Mountain> listOfBerg) {
            this.layoutInflater = LayoutInflater.from(context);
            this.listOfBerg = listOfBerg;
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

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView title;

            ViewHolder(View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.title);
            }


        }


    }