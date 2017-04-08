package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sss.carolina.kyrsovaya.R;

import java.io.IOException;
import java.io.InputStream;

public class UnitActivity extends AppCompatActivity {

    ImageView uImageView;
    AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        uImageView = (ImageView)findViewById(R.id.uImageView);

        assetManager = getAssets();

        String file = "Unit_of_measure";
        String path = "Unit_of_measure/unit.jpg";
        AddPic addPic = new AddPic(uImageView, assetManager);
        addPic.dataFromAssets(file, path);

    }


}
