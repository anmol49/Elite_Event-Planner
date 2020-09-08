package com.example.eliteeventplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ThemeFragment extends Fragment{

    ImageButton imageButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theme, container, false);

        ImageButton imageButton1 = view.findViewById(R.id.btn1);
        ImageButton imageButton2 = view.findViewById(R.id.btn2);
        ImageButton imageButton3 = view.findViewById(R.id.btn3);
        ImageButton imageButton4 = view.findViewById(R.id.btn4);
        ImageButton imageButton5 = view.findViewById(R.id.btn5);
        ImageButton imageButton6 = view.findViewById(R.id.btn6);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), wedding.class));
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), engag.class));
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Mayoon.class));
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Mehndi.class));
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Birdal.class));
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Birthday.class));
            }
        });

        return view;
    }
}
