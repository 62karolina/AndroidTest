package com.sss.carolina.kyrsovaya.Test;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.R;
import com.sss.carolina.kyrsovaya.Test.TheTest.SubThreeNumbActivity;
import com.sss.carolina.kyrsovaya.Test.TheTest.SumThreeNumbActivity;

public class TheThirdTestActivity extends AppCompatActivity {

    Button sumThreeB;
    Button subThreeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_third_test);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        sumThreeB = (Button)findViewById(R.id.sumThreeNumb);
        sumThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheThirdTestActivity.this, SumThreeNumbActivity.class);
                startActivity(intent);
            }
        });

        subThreeB = (Button)findViewById(R.id.subThreeNumb);
        subThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheThirdTestActivity.this, SubThreeNumbActivity.class);
                startActivity(intent);
            }
        });
    }
}
