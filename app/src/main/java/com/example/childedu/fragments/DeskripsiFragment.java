package com.example.childedu.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.childedu.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DeskripsiFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */

public class DeskripsiFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public DeskripsiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_deskripsi, container, false);

        ImageView materi1 = view.findViewById(R.id.materi1);
        ImageView materi2 = view.findViewById(R.id.materi2);
        ImageView materi3 = view.findViewById(R.id.materi3);
        ImageView materi4 = view.findViewById(R.id.materi4);
        ImageView materi5 = view.findViewById(R.id.materi5);
        ImageView materi6 = view.findViewById(R.id.materi6);
        ImageView materi7 = view.findViewById(R.id.materi7);
        ImageView materi8 = view.findViewById(R.id.materi8);
        ImageView materi9 = view.findViewById(R.id.materi9);

        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri1Clicked();
                }
            }
        });

        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri2Clicked();
                }
            }
        });

        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri3Clicked();
                }
            }
        });

        materi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri4Clicked();
                }
            }
        });

        materi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri5Clicked();
                }
            }
        });

        materi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri6Clicked();
                }
            }
        });

        materi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri7Clicked();
                }
            }
        });

        materi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri8Clicked();
                }
            }
        });
        
        materi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    mListener.onmateri9Clicked();
                }
            }
        });


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
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

        void onmateri1Clicked();

        void onmateri2Clicked();

        void onmateri3Clicked();

        void onmateri4Clicked();

        void onmateri5Clicked();

        void onmateri6Clicked();

        void onmateri7Clicked();

        void onmateri8Clicked();

        void onmateri9Clicked();
    }

    public interface OnInteractionListener {
    }
}
