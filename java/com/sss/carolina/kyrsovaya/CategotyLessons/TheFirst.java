package com.sss.carolina.kyrsovaya.CategotyLessons;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.GeometricActivity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.Number_Lesson;
import com.sss.carolina.kyrsovaya.R;

public class TheFirst extends AppCompatActivity {

    Button l_number;
    Button geometricButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_first);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        l_number = (Button)findViewById(R.id.study_n);
        l_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheFirst.this, Number_Lesson.class);
                startActivity(intent);
            }
        });

        geometricButton = (Button)findViewById(R.id.geometric);
        geometricButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheFirst.this, GeometricActivity.class);
                startActivity(intent);
            }
        });
    }
}
