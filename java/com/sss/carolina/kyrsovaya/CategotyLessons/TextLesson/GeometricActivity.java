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

public class GeometricActivity extends AppCompatActivity {

    AssetManager assetManager;

    ImageView g_ellipse;
    ImageView g_square;
    ImageView g_round;
    ImageView g_triangle;
    ImageView g_rhombus;
    ImageView g_trapeze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        assetManager = getAssets();


        g_ellipse = (ImageView)findViewById(R.id.g_ellipse);
        g_square = (ImageView)findViewById(R.id.g_square);
        g_round = (ImageView)findViewById(R.id.g_round);
        g_triangle = (ImageView)findViewById(R.id.g_triangle);
        g_rhombus = (ImageView)findViewById(R.id.g_rhombus);
        g_trapeze = (ImageView)findViewById(R.id.g_trapeze);



        dataFromAssets();
    }

    public void dataFromAssets(){

        // To get names of all files inside the "Files" folder
        try {
            String[] files = assetManager.list("geometric");

            for(int i=0; i<files.length; i++){
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        try {
            InputStream ellipse = assetManager.open("geometric/ellipse.png");
            InputStream square = assetManager.open("geometric/square.png");
            InputStream round = assetManager.open("geometric/round.png");
            InputStream triangle = assetManager.open("geometric/triangle.png");
            InputStream rhombus = assetManager.open("geometric/rhombus.png");
            InputStream trapeze = assetManager.open("geometric/trapeze.png");







            Drawable d_ellipse = Drawable.createFromStream(ellipse, null);
            Drawable d_square = Drawable.createFromStream(square, null);
            Drawable d_round = Drawable.createFromStream(round, null);
            Drawable d_triangle = Drawable.createFromStream(triangle, null);
            Drawable d_rhombus = Drawable.createFromStream(rhombus, null);
            Drawable d_trapeze = Drawable.createFromStream(trapeze, null);






            g_ellipse.setImageDrawable(d_ellipse);
            g_square.setImageDrawable(d_square);
            g_round.setImageDrawable(d_round);
            g_triangle.setImageDrawable(d_triangle);
            g_rhombus.setImageDrawable(d_rhombus);
            g_trapeze.setImageDrawable(d_trapeze);







        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
