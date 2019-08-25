package com.fiqartamin.nowplayingmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle, tvDescription, tvRelease, tvRating;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Movie selectedMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (selectedMovie != null) {
            imgPhoto = findViewById(R.id.img_det_photo);
            imgPhoto.setImageResource(selectedMovie.getPhoto());
            imgPhoto.setScaleType(ImageView.ScaleType.CENTER_CROP);

            tvTitle = findViewById(R.id.tv_det_title);
            tvTitle.setText(selectedMovie.getTitle());

            tvDescription = findViewById(R.id.tv_det_description);
            tvDescription.setText(selectedMovie.getDescription());

            tvRating = findViewById(R.id.tv_det_rating);
            tvRating.setText(selectedMovie.getRating()+"*");

            tvRelease = findViewById(R.id.tv_det_release);
            tvRelease.setText(selectedMovie.getRelease());

        }
    }
}
