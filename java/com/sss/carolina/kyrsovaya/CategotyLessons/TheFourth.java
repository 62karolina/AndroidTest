package com.sss.carolina.kyrsovaya.CategotyLessons;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.DecimalActivity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.DivColActivity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.ProportionActivity;
import com.sss.carolina.kyrsovaya.R;

public class TheFourth extends AppCompatActivity {

    Button bDecimal;
    Button bDivCol;
    Button bProportion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_fourth);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        bDecimal = (Button)findViewById(R.id.bDecimal);
        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheFourth.this, DecimalActivity.class);
                startActivity(intent);
            }
        });

        bDivCol = (Button)findViewById(R.id.bDivCol);
        bDivCol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheFourth.this, DivColActivity.class);
                startActivity(intent);
            }
        });

        bProportion = (Button)findViewById(R.id.bProportion);
        bProportion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheFourth.this, ProportionActivity.class);
                startActivity(intent);
            }
        });
    }
}
