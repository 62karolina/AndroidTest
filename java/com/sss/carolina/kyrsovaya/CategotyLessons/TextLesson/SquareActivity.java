package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class SquareActivity extends AppCompatActivity {

    ImageView iSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        iSquare = (ImageView)findViewById(R.id.iSquare);

        AssetManager assetManager = getAssets();

        AddPic addPic = new AddPic(iSquare, assetManager);
        addPic.dataFromAssets("SubSumm", "SubSumm/square.jpg");

    }
}
