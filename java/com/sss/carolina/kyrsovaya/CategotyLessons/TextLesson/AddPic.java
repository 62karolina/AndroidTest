package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by carolina on 21.03.17.
 */

public class AddPic {

    private InputStream iStream;
    private Drawable dr;
    private ImageView iView;
    private AssetManager assetManager;

    AddPic(ImageView imageView, AssetManager aManager){
        iView = imageView;
        assetManager = aManager;

    }

    public void dataFromAssets(String file, String path){


        // To get names of all files inside the "Files" folder
        try {
            String[] files = assetManager.list(file);

            for(int i=0; i<files.length; i++){
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        try {

            iStream = assetManager.open(path);
            dr = Drawable.createFromStream(iStream, null);
            iView.setImageDrawable(dr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
