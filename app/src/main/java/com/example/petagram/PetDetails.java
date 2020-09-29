package com.example.petagram;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;

public class PetDetails extends AppCompatActivity {

    private static final String KEY_EXTRA_URL = "url";
    private static final String KEY_EXTRA_LIKES = "likes";
    private ImageView ivPetDetailPic;
    private TextView tvDetailLikes;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_photo);

        Toolbar toolbar = (Toolbar) findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle extras = getIntent().getExtras();
        String url = extras.getString(KEY_EXTRA_URL);
        int likes = extras.getInt(KEY_EXTRA_LIKES);

        ivPetDetailPic = findViewById(R.id.ivDetailPetPic);

        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.dog04)
                .into(ivPetDetailPic);

        tvDetailLikes = findViewById(R.id.tvDetailLikes);

        tvDetailLikes.setText(String.valueOf(likes));
    }
}
