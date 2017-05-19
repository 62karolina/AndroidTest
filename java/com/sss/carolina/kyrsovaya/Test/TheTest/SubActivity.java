package com.sss.carolina.kyrsovaya.Test.TheTest;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sss.carolina.kyrsovaya.R;

public class SubActivity extends AppCompatActivity {

    TextView questionsTV, invisibleTV;
    Button trueButton, falseButton;
    ImageButton nextButton;
    EditText trueEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        questionsTV = (TextView)findViewById(R.id.questionsTV1);
        trueButton = (Button)findViewById(R.id.buttonTrue1);
        falseButton = (Button)findViewById(R.id.buttonFalse1);
        nextButton = (ImageButton)findViewById(R.id.nextButton1);
        trueEditText = (EditText)findViewById(R.id.trueEditText1);
        invisibleTV = (TextView)findViewById(R.id.textView5);

        final String symbol = "-";

        TestLessons.textViewMessage(questionsTV, trueButton, falseButton, this, invisibleTV, trueEditText, symbol);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueEditText.getText().length() == 0){
                    TestLessons.textViewMessage(questionsTV, trueButton, falseButton, SubActivity.this, invisibleTV, trueEditText, symbol);
                }else TestLessons.answer(trueEditText, symbol, SubActivity.this);

                TestLessons.textViewMessage(questionsTV, trueButton, falseButton, SubActivity.this, invisibleTV, trueEditText, symbol);

                trueEditText.setVisibility(View.INVISIBLE);
                invisibleTV.setVisibility(View.INVISIBLE);
            }
        });
    }
}
