package com.example.lesson35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson35.fragmentone.FirstFragmentAdapter;
import com.example.lesson35.fragmentone.TytleModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FirstFragment extends Fragment {
    RecyclerView recyclerView;
    List<TytleModel> list;

    FirstFragmentAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new FirstFragmentAdapter();
        recyclerView.setAdapter(adapter);
        list = new ArrayList<>();

        ArrayList<TytleModel> list = new ArrayList<>();
       // for (int i = 0; i < 2 ; i++) {
        list.add(0,new TytleModel("Dark","Web"));
        list.add(1,new TytleModel("Дональд","Кнут"));
        list.add(2,new TytleModel("Джеймс","Гослинг"));
        list.add(3,new TytleModel("Андерс","Хейлсберг"));
        list.add(4,new TytleModel("Марк","Цукерберг"));
        list.add(5,new TytleModel("Брем","Коен"));
        list.add(6,new TytleModel("Брендан","Айк"));
        list.add(7,new TytleModel("Бьерн","Страуструп"));
        list.add(8,new TytleModel("Джон","Кермак"));
        list.add(9,new TytleModel("Стив","Джобс"));
        list.add(10,new TytleModel("Линус","Торвальдс"));


        adapter.addText(list);

    }

}