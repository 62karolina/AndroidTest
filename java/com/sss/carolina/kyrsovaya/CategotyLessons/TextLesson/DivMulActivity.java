package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

public class DivMulActivity extends AppCompatActivity {

    ImageView iDivMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div_mul);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        AssetManager assetManager = getAssets();

        iDivMul = (ImageView)findViewById(R.id.iDivMul);

        AddPic addPic = new AddPic(iDivMul, assetManager);
        addPic.dataFromAssets("SubSumm", "SubSumm/Mul_Div.jpg");
    }
}
