package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class DivColActivity extends AppCompatActivity {

    ImageView iDivCol;
    ImageView iMulCol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div_col);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        iDivCol = (ImageView)findViewById(R.id.iDivCol);
        iMulCol = (ImageView)findViewById(R.id.iMulCol);

        AssetManager assetManager = getAssets();

        String string = "SubSumm";

        AddPic addPic = new AddPic(iDivCol, assetManager);
        addPic.dataFromAssets(string, "SubSumm/DivCol.jpg");
        AddPic addPic1 = new AddPic(iMulCol, assetManager);
        addPic1.dataFromAssets(string, "SubSumm/mulCol.jpg");
    }
}
