package com.carballeira.fragments_dummie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {

    private static final String ARG_TEXT = "param_text";

    private String text;

    public MyFragment() {
        // Required empty public constructor
    }

    /**
     * Constructor del fragment que recibe por parámetro el texto del input field
     * @param text
     * @return fragment
     */
    public static MyFragment newInstance(String text) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            text = getArguments().getString(ARG_TEXT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        TextView tv = view.findViewById(R.id.tv_result);
        tv.setText(text);
        return view;
    }
}