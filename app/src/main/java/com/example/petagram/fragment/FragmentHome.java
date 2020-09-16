package com.example.petagram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petagram.R;
import com.example.petagram.adapter.PetAdapter;
import com.example.petagram.pojo.PetItem;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    private ArrayList<PetItem> petItems = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new PetAdapter(petItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        petItems.add(new PetItem(R.drawable.dog_01, "Candy", "0", "0"));
        petItems.add(new PetItem(R.drawable.dog_02, "Lolly", "1", "0"));
        petItems.add(new PetItem(R.drawable.dog_03, "Max", "2", "0"));
        petItems.add(new PetItem(R.drawable.dog04, "Giorgio", "3", "0"));
        petItems.add(new PetItem(R.drawable.dog05, "Manu", "4", "0"));
        petItems.add(new PetItem(R.drawable.dog06, "Kaia", "5", "0"));
        petItems.add(new PetItem(R.drawable.dog07, "Linda", "6", "0"));
        petItems.add(new PetItem(R.drawable.dog08, "Milo", "7", "0"));

        return view;
    }
}
