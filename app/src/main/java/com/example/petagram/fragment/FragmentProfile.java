package com.example.petagram.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petagram.R;
import com.example.petagram.adapter.ProfileAdapter;
import com.example.petagram.model.PetResponse;
import com.example.petagram.pojo.PetItem;
import com.example.petagram.pojo.ProfileItem;
import com.example.petagram.presenter.IProfileFragmentPresenter;
import com.example.petagram.presenter.ProfileFragmentPresenter;
import com.example.petagram.restAPI.EndpointsAPI;
import com.example.petagram.restAPI.adapter.RestApiAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentProfile extends Fragment implements IProfileFragmentView {

    private IProfileFragmentPresenter iProfileFragmentPresenter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        iProfileFragmentPresenter = new ProfileFragmentPresenter(this, getContext());
        recyclerView = view.findViewById(R.id.recyclerViewFragmentProfile);

        //recyclerView.setHasFixedSize(true);
        //recyclerView.setAdapter(new ProfileAdapter(profileItems, getActivity()));
        //recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        return view;
    }

    @Override
    public void generateGridLayout() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    @Override
    public ProfileAdapter createAdapter(ArrayList<ProfileItem> profileItems) {
        ProfileAdapter profileAdapter = new ProfileAdapter(profileItems, getActivity());
        return profileAdapter;
    }

    @Override
    public void initializeAdapter(ProfileAdapter profileAdapter) {
        recyclerView.setAdapter(profileAdapter);
    }
}