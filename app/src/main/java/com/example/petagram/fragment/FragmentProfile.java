package com.example.petagram.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petagram.R;
import com.example.petagram.adapter.PetAdapter;
import com.example.petagram.adapter.ProfileAdapter;
import com.example.petagram.pojo.ProfileItem;

import java.util.ArrayList;

public class FragmentProfile extends Fragment {

    private ArrayList<ProfileItem> profileItems = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new ProfileAdapter(profileItems, getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        profileItems.add(new ProfileItem(R.drawable.dog09, "10"));
        profileItems.add(new ProfileItem(R.drawable.dog10, "25"));
        profileItems.add(new ProfileItem(R.drawable.dog11, "13"));
        profileItems.add(new ProfileItem(R.drawable.dog12, "28"));
        profileItems.add(new ProfileItem(R.drawable.dog13, "41"));
        profileItems.add(new ProfileItem(R.drawable.dog14, "21"));
        profileItems.add(new ProfileItem(R.drawable.dog04, "33"));
        profileItems.add(new ProfileItem(R.drawable.dog16, "16"));
        profileItems.add(new ProfileItem(R.drawable.dog17, "26"));

        return view;
    }
}