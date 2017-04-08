package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class SumSubActivity extends AppCompatActivity {

    ImageView iSum;
    ImageView iSub;
    AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_sub);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        iSum = (ImageView)findViewById(R.id.iSum);
        iSub = (ImageView)findViewById(R.id.iSub);

        assetManager = getAssets();

        String file = "SubSumm";
        AddPic addPic = new AddPic(iSum, assetManager);
        addPic.dataFromAssets(file, "SubSumm/summ.jpg");

        AddPic addPic1 = new AddPic(iSub, assetManager);
        addPic1.dataFromAssets(file, "SubSumm/sub.jpg");

    }
}
