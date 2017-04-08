package com.sss.carolina.kyrsovaya;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.Test.TheFirstTestActivity;

public class TestsActivity extends AppCompatActivity {

    Button theFirst;


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
    }
}
