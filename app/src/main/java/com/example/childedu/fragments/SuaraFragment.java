package com.example.childedu.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.childedu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuaraFragment extends Fragment {


    public SuaraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suara, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}
