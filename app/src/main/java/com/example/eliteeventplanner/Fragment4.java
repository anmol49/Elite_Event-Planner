package com.example.eliteeventplanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;


public class Fragment4 extends Fragment {
    public Fragment4(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_4, container, false);
        //String[] menuItems = {"do","do something","do yet"};
        //ListView listView = view.findViewById(R.id.mylistview);
        //ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
        //getActivity(),
        //android.R.layout.simple_list_item_1,
        //menuItems);
        //listView.setAdapter(listViewAdapter);
        return view;
    }
}
