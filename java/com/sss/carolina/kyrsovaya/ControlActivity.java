package com.sss.carolina.kyrsovaya;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sss.carolina.kyrsovaya.ControlKnowlendge.TheFirstCKActivity;
import com.sss.carolina.kyrsovaya.ControlKnowlendge.TheFourthCKActivity;
import com.sss.carolina.kyrsovaya.ControlKnowlendge.TheSecondCKActivity;
import com.sss.carolina.kyrsovaya.ControlKnowlendge.TheThirdCKActivity;

public class ControlActivity extends AppCompatActivity {

    Button theFirstControl;
    Button theSecondControl;
    Button theThirdControl;
    Button theFourthControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        theFirstControl = (Button)findViewById(R.id.theFirstControl);
        theFirstControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, TheFirstCKActivity.class);
                startActivity(intent);
            }
        });

        theSecondControl = (Button)findViewById(R.id.theSecondControl);
        theSecondControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, TheSecondCKActivity.class);
                startActivity(intent);
            }
        });

        theThirdControl = (Button)findViewById(R.id.theThirdControl);
        theThirdControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, TheThirdCKActivity.class);
                startActivity(intent);
            }
        });

        theFourthControl = (Button)findViewById(R.id.theFourthControl);
        theFourthControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, TheFourthCKActivity.class);
                startActivity(intent);
            }
        });

    }
}
