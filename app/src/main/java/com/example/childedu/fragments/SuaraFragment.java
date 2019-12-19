package com.example.childedu.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.childedu.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SuaraFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class SuaraFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public SuaraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_suara, container, false);

        Button sound1 = view.findViewById(R.id.sound1);
        Button sound2 = view.findViewById(R.id.sound2);
        Button sound3 = view.findViewById(R.id.sound3);
        Button sound4 = view.findViewById(R.id.sound4);
        Button sound5 = view.findViewById(R.id.sound5);
        Button sound6 = view.findViewById(R.id.sound6);
        Button sound7 = view.findViewById(R.id.sound7);
        Button sound8 = view.findViewById(R.id.sound8);
        Button sound9 = view.findViewById(R.id.sound9);

        sound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound1Clicked();
                }
            }
        });

        sound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound2Clicked();
                }
            }
        });

        sound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound3Clicked();
                }
            }
        });

        sound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound4Clicked();
                }
            }
        });

        sound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound5Clicked();
                }
            }
        });

        sound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound6Clicked();
                }
            }
        });

        sound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound7Clicked();
                }
            }
        });

        sound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound8Clicked();
                }
            }
        });

        sound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onsound9Clicked();
                }
            }
        });

        return view;
    }

    private void setContentView(int activity_main) {
    }

    // TODO: Rename method, update argument and hook method into UI event
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DeskripsiFragment.OnFragmentInteractionListener) {
            mListener = (SuaraFragment.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onsound1Clicked();
        void onsound2Clicked();
        void onsound3Clicked();
        void onsound4Clicked();
        void onsound5Clicked();
        void onsound6Clicked();
        void onsound7Clicked();
        void onsound8Clicked();
        void onsound9Clicked();
    }
}
