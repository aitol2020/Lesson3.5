package com.example.lesson35.fragmentone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson35.FirstFragment;
import com.example.lesson35.R;

import java.util.ArrayList;

public class FirstFragmentAdapter extends RecyclerView.Adapter<FirstFragmentAdapter.MainViewHolder> {


    ArrayList<TytleModel> list;

    public FirstFragmentAdapter() {
        ArrayList<TytleModel> list = new ArrayList<>();
        this.list = list;
    }

    public void addText(ArrayList<TytleModel> titlemodel) {
        list = titlemodel;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FirstFragmentAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
      holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

         TextView Tytle;
         TextView des;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            Tytle = itemView.findViewById(R.id.Name);
            des = itemView.findViewById(R.id.surname);
        }

        public void onBind(TytleModel tytleModel) {
            Tytle.setText(tytleModel.Tytle);
            des.setText(tytleModel.des);

        }
    }

    }

