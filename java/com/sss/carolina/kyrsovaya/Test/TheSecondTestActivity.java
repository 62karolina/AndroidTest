package com.sss.carolina.kyrsovaya.Test;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.R;
import com.sss.carolina.kyrsovaya.Test.TheTest.MulActivity;

public class TheSecondTestActivity extends AppCompatActivity {

    Button learnMulB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_second_test);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        learnMulB = (Button)findViewById(R.id.learnMulB);
        learnMulB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheSecondTestActivity.this, MulActivity.class);
                startActivity(intent);
            }
        });
    }
}
