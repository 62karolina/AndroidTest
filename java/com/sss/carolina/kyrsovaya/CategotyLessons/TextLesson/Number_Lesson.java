package com.sss.carolina.kyrsovaya.CategotyLessons.TextLesson;

import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.sss.carolina.kyrsovaya.R;

import java.io.IOException;
import java.io.InputStream;

public class Number_Lesson extends AppCompatActivity {

    AssetManager assetManager;
    SoundPool mSoundPool;

    ImageView n_zero;
    ImageView n_one;
    ImageView n_two;
    ImageView n_three;
    ImageView n_four;
    ImageView n_five;
    ImageView n_six;
    ImageView n_seven;
    ImageView n_eight;
    ImageView n_nine;
    int a_zero, a_one, a_two, a_three, a_four, a_five, a_six,
        a_seven, a_eight, a_nine;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number__lesson);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        /**
         * id for ImageView
         * */
        n_zero = (ImageView)findViewById(R.id.n_zero);
        n_one = (ImageView)findViewById(R.id.n_one);
        n_two = (ImageView)findViewById(R.id.n_two);
        n_three = (ImageView)findViewById(R.id.n_three);
        n_four = (ImageView)findViewById(R.id.n_four);
        n_five = (ImageView)findViewById(R.id.n_five);
        n_six = (ImageView)findViewById(R.id.n_six);
        n_seven = (ImageView)findViewById(R.id.n_seven);
        n_eight = (ImageView)findViewById(R.id.n_eight);
        n_nine = (ImageView)findViewById(R.id.n_nine);

        assetManager = getAssets();
        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);

        /**
         * Load Sounds
         * @see loadSound
         * */
        a_zero = loadSound("Audio_number/audio0.mp3");
        a_one = loadSound("Audio_number/audio1.mp3");
        a_two = loadSound("Audio_number/audio2.mp3");
        a_three = loadSound("Audio_number/audio3.mp3");
        a_four = loadSound("Audio_number/audio4.mp3");
        a_five = loadSound("Audio_number/audio5.mp3");
        a_six = loadSound("Audio_number/audio6.mp3");
        a_seven = loadSound("Audio_number/audio7.mp3");
        a_eight = loadSound("Audio_number/audio8.mp3");
        a_nine = loadSound("Audio_number/audio9.mp3");
        
        dataFromAssets();

        /**
         * setOnClickListener for ImageView*/
        n_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_zero);
            }
        });
        n_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_one);
            }
        });
        n_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_two);
            }
        });
        n_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_three);
            }
        });
        n_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_four);
            }
        });
        n_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_five);
            }
        });
        n_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_six);
            }
        });
        n_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_seven);
            }
        });
        n_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_eight);
            }
        });
        n_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(a_nine);
            }
        });
    }

    public void dataFromAssets(){

        String file = "Numbers";

        String zero = "Numbers/zero.png";
        AddPic addPic = new AddPic(n_zero, assetManager);
        addPic.dataFromAssets(file, zero);

        String one = "Numbers/one.png";
        AddPic addPic1 = new AddPic(n_one, assetManager);
        addPic1.dataFromAssets(file, one);

        String two = "Numbers/two.png";
        AddPic addPic2 = new AddPic(n_two, assetManager);
        addPic2.dataFromAssets(file, two);

        String three = "Numbers/three.png";
        AddPic addPic3 = new AddPic(n_three, assetManager);
        addPic3.dataFromAssets(file, three);

        String four = "Numbers/four.png";
        AddPic addPic4 = new AddPic(n_four, assetManager);
        addPic4.dataFromAssets(file, four);

        String five = "Numbers/five.png";
        AddPic addPic5 = new AddPic(n_five, assetManager);
        addPic5.dataFromAssets(file, five);

        String six = "Numbers/six.png";
        AddPic addPic6 = new AddPic(n_six, assetManager);
        addPic6.dataFromAssets(file, six);

        String seven = "Numbers/seven.png";
        AddPic addPic7 = new AddPic(n_seven, assetManager);
        addPic7.dataFromAssets(file, seven);

        String eight = "Numbers/eight.png";
        AddPic addPic8 = new AddPic(n_eight, assetManager);
        addPic8.dataFromAssets(file, eight);

        String nine = "Numbers/nine.png";
        AddPic addPic9 = new AddPic(n_nine, assetManager);
        addPic9.dataFromAssets(file, nine);
    }

    private int loadSound(String fileName) {
        AssetFileDescriptor afd = null;
        try {
            afd = assetManager.openFd(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Couldn't load file '" + fileName + "'", Toast.LENGTH_SHORT).show();
            return -1;
        }
        return mSoundPool.load(afd, 1);
    }

    protected void playSound(int sound) {
        if (sound > 0)
            mSoundPool.play(sound, 1, 1, 1, 0, 1);
    }
}
