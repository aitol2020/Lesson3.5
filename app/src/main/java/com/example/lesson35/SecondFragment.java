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
import com.example.lesson35.fragmenttwo.Number;
import com.example.lesson35.fragmenttwo.SecondFragmentAdapter;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {


    RecyclerView recyclerView;
    List<Number> list;

    SecondFragmentAdapter adapter;


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
        adapter = new SecondFragmentAdapter();
        recyclerView.setAdapter(adapter);
        list = new ArrayList<>();

        ArrayList<Number> list = new ArrayList<>();
            list.add(0,new Number("1"));
            list.add(1,new Number("2"));
            list.add(2,new Number("3"));
            list.add(3,new Number("4"));
            list.add(4,new Number("5"));
            list.add(5,new Number("6"));
            list.add(6,new Number("7"));
            list.add(7,new Number("8"));
            list.add(8,new Number("9"));
            list.add(9,new Number("10"));
            list.add(10,new Number("11"));
            list.add(11,new Number("12"));
            list.add(12,new Number("13"));
            list.add(13,new Number("14"));
            list.add(14,new Number("15"));
            list.add(15,new Number("16"));
            list.add(16,new Number("17"));
            list.add(17,new Number("18"));
            list.add(18,new Number("19"));
            list.add(19,new Number("20"));
            list.add(20,new Number("21"));
            list.add(21,new Number("22"));
            list.add(22,new Number("23"));
            list.add(23,new Number("24"));
            list.add(24,new Number("25"));
            list.add(25,new Number("26"));
            list.add(26,new Number("27"));
            list.add(27,new Number("28"));
            list.add(28,new Number("29"));
            list.add(29,new Number("30"));

    
            adapter.addText(list);

        }

    }