package com.example.childedu.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.childedu.R;
import com.example.childedu.activities.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomeFragment extends Fragment {

    EditText editTextNama;
    Button buttonAddNama;
    Spinner spinnerKelas;

    DatabaseReference databaseNama;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        databaseNama = FirebaseDatabase.getInstance().getReference("Nama");
        View view;
        view = inflater.inflate(R.layout.fragment_home, container, false);

        editTextNama    = (EditText) view.findViewById(R.id.editTextName);
        buttonAddNama   = view.findViewById(R.id.buttonAddNama);
        spinnerKelas    = (Spinner) view.findViewById(R.id.spinnerKelas);


        buttonAddNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahNama();
            }
        });

        return view;
    }

    private void tambahNama(){
        String nama     = editTextNama.getText().toString().trim();
        String kelas    = spinnerKelas.getSelectedItem().toString();

        if(!TextUtils.isEmpty(nama)){
            String id = databaseNama.push().getKey();
            User user = new User(id, nama, kelas);
            databaseNama.child(id).setValue(user);
            Toast.makeText(getActivity(), "Nama Berhasil Ditambahkan", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getActivity(), "Masukkan Namamu", Toast.LENGTH_LONG).show();
        }
    }

}
