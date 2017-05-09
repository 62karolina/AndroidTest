package com.sss.carolina.kyrsovaya.Test;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.CategotyLessons.TheFirst;
import com.sss.carolina.kyrsovaya.R;

public class TheFirstTestActivity extends AppCompatActivity {

    Button numberTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_first_test);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        numberTest = (Button)findViewById(R.id.numberTestB);
        numberTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheFirstTestActivity.this, NumberTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
