package com.example.petagram.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.petagram.R;
import com.example.petagram.pojo.ProfileItem;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    private ArrayList<ProfileItem> profileItems;
    private Context context;

    public ProfileAdapter(ArrayList<ProfileItem> profileItems, Context context) {
        this.profileItems = profileItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_profile, parent, false);

        return new ProfileAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileAdapter.ViewHolder holder, int position) {
        final ProfileItem profileItem = profileItems.get(position);
        holder.ivPetPic.setImageResource(profileItem.getPetPic());
        holder.tvLikes.setText(profileItem.getLikes());
    }

    @Override
    public int getItemCount() {
        return profileItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivPetPic;
        private TextView tvLikes;
        private ImageView ivFavBtn;

        public ViewHolder(View itemView) {
            super(itemView);

            ivPetPic = itemView.findViewById(R.id.ivPetPic);
            tvLikes = itemView.findViewById(R.id.tvLikes);
            ivFavBtn = itemView.findViewById(R.id.ivFacBtn);
        }
    }
}
