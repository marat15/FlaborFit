package com.example.myele.flaborfit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView excerciseText = (TextView)findViewById(R.id.excerciseTitle);
        ImageView excerciseImage = (ImageView)findViewById(R.id.excerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        excerciseText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_WEIGHTS)){
            excerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            // getResorces get 'res' folder, getDrawable gets drawable folder, R.drawable grabs id.
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));

        }else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_YOGA)){
            excerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_CARDIO)){
            excerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }


    }
}
