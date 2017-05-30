package com.sss.carolina.kyrsovaya.ControlKnowlendge;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sss.carolina.kyrsovaya.R;
import com.sss.carolina.kyrsovaya.Test.TheTest.MulActivity;
import com.sss.carolina.kyrsovaya.Test.TheTest.TestLessons;

public class TheSecondCKActivity extends AppCompatActivity {

    TextView questionsTV, invisibleTV;
    Button trueButton, falseButton;
    ImageButton nextButton;
    EditText trueEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_second_ck);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        final String symbol = "*";


        questionsTV = (TextView)findViewById(R.id.questionsTV2);
        invisibleTV = (TextView)findViewById(R.id.invisibleTV2);
        trueButton = (Button)findViewById(R.id.buttonTrue2);
        falseButton = (Button)findViewById(R.id.buttonFalse2);
        nextButton = (ImageButton)findViewById(R.id.nextButton2);
        trueEditText = (EditText)findViewById(R.id.trueEditText2);

        TestLessons.textViewMessage(questionsTV, trueButton, falseButton, this, invisibleTV, trueEditText, symbol);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueEditText.getText().length() == 0){
                    TestLessons.textViewMessage(questionsTV, trueButton, falseButton, TheSecondCKActivity.this, invisibleTV, trueEditText, symbol);
                }else TestLessons.answer(trueEditText, symbol, TheSecondCKActivity.this);

                TestLessons.textViewMessage(questionsTV, trueButton, falseButton, TheSecondCKActivity.this, invisibleTV, trueEditText, symbol);

                trueEditText.setText("");
                trueEditText.setVisibility(View.INVISIBLE);
                invisibleTV.setVisibility(View.INVISIBLE);
            }
        });

    }
}
