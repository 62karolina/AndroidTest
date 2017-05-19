package com.sss.carolina.kyrsovaya;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.Test.TheFirstTestActivity;
import com.sss.carolina.kyrsovaya.Test.TheFourthTestActivity;
import com.sss.carolina.kyrsovaya.Test.TheSecondTestActivity;
import com.sss.carolina.kyrsovaya.Test.TheThirdTestActivity;

public class TestsActivity extends AppCompatActivity {

    Button theFirst;
    Button theSecond;
    Button theThird;
    Button theFourth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        theFirst = (Button)findViewById(R.id.theFirstTestB);
        theFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestsActivity.this, TheFirstTestActivity.class);
                startActivity(intent);
            }
        });

        theSecond = (Button)findViewById(R.id.theSecondTestB);
        theSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestsActivity.this, TheSecondTestActivity.class);
                startActivity(intent);
            }
        });

        theThird = (Button)findViewById(R.id.theThirdTestB);
        theThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestsActivity.this, TheThirdTestActivity.class);
                startActivity(intent);
            }
        });

        theFourth = (Button)findViewById(R.id.theFourthTestB);
        theFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestsActivity.this, TheFourthTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
