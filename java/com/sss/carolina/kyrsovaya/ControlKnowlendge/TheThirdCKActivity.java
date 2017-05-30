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

public class TheThirdCKActivity extends AppCompatActivity {

    TextView questionsTV, invisibleTV;
    Button trueButton, falseButton;
    ImageButton nextButton;
    EditText trueEditText;



    private Random random = new Random();
    private int symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_third_ck);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        questionsTV = (TextView)findViewById(R.id.questionsTV6);
        invisibleTV = (TextView)findViewById(R.id.invisibleTV3);
        trueButton = (Button)findViewById(R.id.buttonTrue7);
        falseButton = (Button)findViewById(R.id.buttonFalse7);
        nextButton = (ImageButton)findViewById(R.id.nextButton6);
        trueEditText = (EditText)findViewById(R.id.trueEditText6);

        symbol = random.nextInt(2) + 1;

        QuestionsTheThird.textViewMessage(questionsTV, trueButton, falseButton, this, invisibleTV, trueEditText, symbol);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symbol = random.nextInt(2) + 1;
                Log.d("Random symb = ", Integer.toString(symbol));



                if(trueEditText.getText().length() == 0){
                    QuestionsTheThird.textViewMessage(questionsTV, trueButton, falseButton, TheThirdCKActivity.this, invisibleTV, trueEditText, symbol);
                }else {
                    QuestionsTheThird.answer(trueEditText, symbol, TheThirdCKActivity.this);
                    QuestionsTheThird.textViewMessage(questionsTV, trueButton, falseButton, TheThirdCKActivity.this, invisibleTV, trueEditText, symbol);

                }


                trueEditText.setText("");
                trueEditText.setVisibility(View.INVISIBLE);
                invisibleTV.setVisibility(View.INVISIBLE);
            }
        });
    }
}
