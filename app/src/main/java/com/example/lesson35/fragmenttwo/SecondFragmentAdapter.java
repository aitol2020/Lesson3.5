package com.example.lesson35.fragmenttwo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson35.R;
import com.example.lesson35.fragmentone.TytleModel;

import java.util.ArrayList;

public class SecondFragmentAdapter extends RecyclerView.Adapter<SecondFragmentAdapter.MainViewHolder> {


    ArrayList<Number> list;

    public SecondFragmentAdapter() {
        ArrayList<Number> list = new ArrayList<>();
        this.list = list;
    }

    public void addText(ArrayList<Number> number) {
        list = number;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SecondFragmentAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.number_list, parent, false);

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

       TextView num;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            num = itemView.findViewById(R.id.nums);
        }

        public void onBind(Number number) {
            num.setText(number.num);


        }
    }

}

