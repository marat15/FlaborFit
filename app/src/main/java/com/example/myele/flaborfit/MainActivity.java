package com.example.myele.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE="extra.item.title";
    public static final String EXCERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXCERCISE_YOGA = "Yoga";
    public static final String EXCERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERCISE_WEIGHTS);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERCISE_CARDIO);
            }
        });

    }

    private void loadDetailActivity(String excerciseTitle){
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class); // arbitaray messenger than can send message/data to the operating system (activity manager)
        // Loading from "MainActivity.this"(MainActivity view), and which activity is being loaded (DetailsActivity.class)
        // basically Intent(where is it coming from, where do you want to go?)
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, excerciseTitle);
        startActivity(intent);
    }
}
