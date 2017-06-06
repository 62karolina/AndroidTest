package com.sss.carolina.kyrsovaya.ControlKnowlendge;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sss.carolina.kyrsovaya.R;

import java.util.Random;

public class TheFourthCKActivity extends AppCompatActivity {

    TextView questionsTV, invisibleTV;
    Button trueButton, falseButton;
    ImageButton nextButton;
    EditText trueEditText;

    private Random random = new Random();
    private int symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_fourth_ck);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        questionsTV = (TextView)findViewById(R.id.questionsTV8);
        invisibleTV = (TextView)findViewById(R.id.invisibleTV5);
        trueButton = (Button)findViewById(R.id.buttonTrue9);
        falseButton = (Button)findViewById(R.id.buttonFalse9);
        nextButton = (ImageButton)findViewById(R.id.nextButton9);
        trueEditText = (EditText)findViewById(R.id.trueEditText9);

        symbol = random.nextInt(2) + 1;

        QuestionsTheFourth.textViewMessage(questionsTV, trueButton, falseButton, TheFourthCKActivity.this, invisibleTV, trueEditText, symbol);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symbol = random.nextInt(3) + 1;
                Log.d("Random symb = ", Integer.toString(symbol));



                if(trueEditText.getText().length() == 0){
                    QuestionsTheFourth.textViewMessage(questionsTV, trueButton, falseButton, TheFourthCKActivity.this, invisibleTV, trueEditText, symbol);
                }else {
                    QuestionsTheFourth.answer(trueEditText, symbol, TheFourthCKActivity.this);
                    QuestionsTheFourth.textViewMessage(questionsTV, trueButton, falseButton, TheFourthCKActivity.this, invisibleTV, trueEditText, symbol);

                }


                trueEditText.setText("");
                trueEditText.setVisibility(View.INVISIBLE);
                invisibleTV.setVisibility(View.INVISIBLE);
            }
        });


    }
}
