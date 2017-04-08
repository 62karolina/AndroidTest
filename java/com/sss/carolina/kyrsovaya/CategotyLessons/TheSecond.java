package com.sss.carolina.kyrsovaya.CategotyLessons;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.DivMulActivity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.Numbers100Activity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.SumSubActivity;
import com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson.UnitActivity;
import com.sss.carolina.kyrsovaya.R;

import java.io.InputStream;

public class TheSecond extends AppCompatActivity {

    Button bNumber100;
    Button bUnit;
    Button bSumSub;
    Button bDivMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_second);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        bNumber100 = (Button)findViewById(R.id.bNumbers100);
        bNumber100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheSecond.this, Numbers100Activity.class);
                startActivity(intent);
            }
        });

        bUnit = (Button)findViewById(R.id.bUnit);
        bUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheSecond.this, UnitActivity.class);
                startActivity(intent);
            }
        });

        bSumSub = (Button)findViewById(R.id.bSumSub);
        bSumSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheSecond.this, SumSubActivity.class);
                startActivity(intent);
            }
        });

        bDivMul = (Button)findViewById(R.id.bMulDiv);
        bDivMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheSecond.this, DivMulActivity.class);
                startActivity(intent);
            }
        });
    }
}
