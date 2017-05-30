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

public class SubThreeNumbActivity extends AppCompatActivity {

    TextView questionsTV, invisibleTV;
    Button trueButton, falseButton;
    ImageButton nextButton;
    EditText trueEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_three_numb);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        questionsTV = (TextView)findViewById(R.id.questionsTV4);
        trueButton = (Button)findViewById(R.id.buttonTrue5);
        falseButton = (Button)findViewById(R.id.buttonFalse5);
        nextButton = (ImageButton)findViewById(R.id.nextButton5);
        trueEditText = (EditText)findViewById(R.id.trueEditText5);
        invisibleTV = (TextView)findViewById(R.id.textView9);

        final String symbol = "-";

        ThreeNumberClass.textViewMessage(questionsTV, trueButton, falseButton, this, invisibleTV, trueEditText, symbol);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueEditText.getText().length() == 0){
                    ThreeNumberClass.textViewMessage(questionsTV, trueButton, falseButton, SubThreeNumbActivity.this, invisibleTV, trueEditText, symbol);
                }else ThreeNumberClass.answer(trueEditText, symbol, SubThreeNumbActivity.this);

                ThreeNumberClass.textViewMessage(questionsTV, trueButton, falseButton, SubThreeNumbActivity.this, invisibleTV, trueEditText, symbol);

                trueEditText.setText("");
                trueEditText.setVisibility(View.INVISIBLE);
                invisibleTV.setVisibility(View.INVISIBLE);
            }
        });

    }
}
