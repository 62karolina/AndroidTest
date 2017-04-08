package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class DecimalActivity extends AppCompatActivity {

    ImageView iDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        iDecimal = (ImageView)findViewById(R.id.iDecimal);

        AssetManager assetManager = getAssets();

        AddPic addPic = new AddPic(iDecimal, assetManager);
        addPic.dataFromAssets("SubSumm", "SubSumm/decimal_digit.jpg");
    }
}
