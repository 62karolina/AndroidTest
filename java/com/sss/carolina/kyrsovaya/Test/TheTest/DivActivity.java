package com.sss.carolina.kyrsovaya.Test.TheTest;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.sss.carolina.kyrsovaya.R;

public class DivActivity extends AppCompatActivity {

    TextView questionsTV, invisibleTV;
    Button trueButton, falseButton, noAns;
    ImageButton nextButton;
    EditText trueEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        questionsTV = (TextView) findViewById(R.id.questionsTV7);
        trueButton = (Button) findViewById(R.id.buttonTrue8);
        falseButton = (Button) findViewById(R.id.buttonFalse8);
        nextButton = (ImageButton) findViewById(R.id.nextButton8);
        trueEditText = (EditText) findViewById(R.id.trueEditText8);
        invisibleTV = (TextView) findViewById(R.id.invisibleTV4);
        noAns = (Button) findViewById(R.id.buttonNoAns);

        final String symbol = "/";

        DivClass.textViewMessage(questionsTV, trueButton, falseButton, noAns, this, invisibleTV, trueEditText, symbol);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (trueEditText.getText().length() == 0) {
                    DivClass.textViewMessage(questionsTV, trueButton, falseButton, noAns, DivActivity.this, invisibleTV, trueEditText, symbol);
                } else DivClass.answer(trueEditText, symbol, DivActivity.this);

                DivClass.textViewMessage(questionsTV, trueButton, falseButton, noAns, DivActivity.this, invisibleTV, trueEditText, symbol);

                trueEditText.setText("");
                trueEditText.setVisibility(View.INVISIBLE);
                invisibleTV.setVisibility(View.INVISIBLE);
            }
        });

      

    }
}
