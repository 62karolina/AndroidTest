package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class EquationActivity extends AppCompatActivity {

    ImageView iEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        iEquals = (ImageView)findViewById(R.id.iEqual);

        AssetManager assetManager = getAssets();

        AddPic addPic = new AddPic(iEquals, assetManager);
        addPic.dataFromAssets("SubSumm", "SubSumm/equation.jpg");

    }
}
