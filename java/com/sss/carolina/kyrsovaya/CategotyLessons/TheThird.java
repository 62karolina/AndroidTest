package com.sss.carolina.kyrsovaya.CategotyLessons;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.EquationActivity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.SquareActivity;
import com.sss.carolina.kyrsovaya.R;


public class TheThird extends AppCompatActivity {

    Button bEquals;
    Button bSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_third);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        bEquals = (Button)findViewById(R.id.bEquals);
        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheThird.this, EquationActivity.class);
                startActivity(intent);
            }
        });

        bSquare = (Button)findViewById(R.id.bSquare);
        bSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheThird.this, SquareActivity.class);
                startActivity(intent);
            }
        });
    }
}
