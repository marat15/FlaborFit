package com.example.myele.flaborfit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView excerciseTitle = (TextView)findViewById(R.id.excerciseTitle);
        ImageView excerciseImage = (ImageView)findViewById(R.id.excerciseImage);



    }
}
