package com.sss.carolina.kyrsovaya;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.CategotyLessons.TheFirst;
import com.sss.carolina.kyrsovaya.CategotyLessons.TheFourth;
import com.sss.carolina.kyrsovaya.CategotyLessons.TheSecond;
import com.sss.carolina.kyrsovaya.CategotyLessons.TheThird;

import static android.R.attr.onClick;

public class LessonsActivity extends AppCompatActivity {

    Button theFirst;
    Button theSecond;
    Button theThird;
    Button theFourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        theFirst = (Button)findViewById(R.id.theFirst);
        theFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, TheFirst.class);
                startActivity(intent);
            }
        });

        theSecond = (Button)findViewById(R.id.theSecond);
        theSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, TheSecond.class);
                startActivity(intent);
            }
        });

        theThird = (Button)findViewById(R.id.theThird);
        theThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, TheThird.class);
                startActivity(intent);
            }
        });

        theFourth = (Button)findViewById(R.id.theFourth);
        theFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, TheFourth.class);
                startActivity(intent);
            }
        });

    }



}
