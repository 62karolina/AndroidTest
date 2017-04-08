package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

import java.io.IOException;
import java.io.InputStream;

public class Numbers100Activity extends AppCompatActivity {

    ImageView number100;
    AssetManager assetManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers100);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        number100 = (ImageView)findViewById(R.id.number100);

        assetManager = getAssets();


        String zero = "Numbers/numbers100.png";
        AddPic addPic = new AddPic(number100, assetManager);
        addPic.dataFromAssets("Numbers", zero);
    }


}
