package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class ProportionActivity extends AppCompatActivity {

    ImageView iProportion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proportion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        iProportion = (ImageView)findViewById(R.id.iProportion);

        AssetManager assetManager = getAssets();

        AddPic addPic = new AddPic(iProportion, assetManager);
        addPic.dataFromAssets("SubSumm", "SubSumm/proportion.png");
    }
}
