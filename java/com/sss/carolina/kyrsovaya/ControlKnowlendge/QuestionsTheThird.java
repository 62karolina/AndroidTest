package com.sss.carolina.kyrsovaya.ControlKnowlendge;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by carolina on 29.05.17.
 */

public class QuestionsTheThird {
    private static int num1, num2, num3, num4, number;

    public static void textViewMessage(TextView textView, Button trueB, Button falseB, final Context context, final TextView textView1,
                                       final EditText editText, final int symbol) {
        Random rand = new Random();

        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10) + 1;
        num3 = rand.nextInt(10);
        num4 = rand.nextInt(29) + 1;
        Log.d("dd", String.valueOf(num1));
        Log.d("dsfdsf", String.valueOf(num2));

        number = randomSumm(num1, num2, num3, symbol);



        if(symbol == 1){
            textView.setText(num1 + " - " + num2 + " - " + num3 + " = " + num4);
            if((num1 < num2)||(num1<num3)){
                num1 += num2 + 10;
                textView.setText(num1 + " - " + num2 + " - " + num3 + " = " + num4);
            }else textView.setText(num1 + " " + " - " + " " + num2 + " " + " - " + " " + num3 + " = " + num4);
        }else textView.setText(num1 + " + " + num2 + " + " + num3 + " = " + num4);

        trueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num4 == number){
                    Toast.makeText(context, "Вы ответили правильно", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(context, "Вы ответили не правильно", Toast.LENGTH_SHORT).show();

            }
        });

        falseB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num4 != number){
                    Toast.makeText(context, "Вы ответили правильно", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(context, "Вы ответили не правильно", Toast.LENGTH_SHORT).show();

                textView1.setVisibility(View.VISIBLE);
                editText.setVisibility(View.VISIBLE);
            }
        });
    }

    private static int randomSumm(int number1, int number2, int number3, int symb){
        int result = 0;

        if(symb == 2) {
            result = number1 + number2 + number3;

            return result;
        }
        if(symb == 1){
            if((number1 < number2)||(number1 < number3)){
                number1 += number2 + 10;
                result = number1 - number2 - number3;
                return result;

            }else {
                result = number1 - number2 - number3;

                return result;
            }
        }


        return result;
    }

    public static void answer(EditText editText, int symb, final Context context){
        int i;


        i = randomSumm(num1, num2, num3, symb);
        if(Integer.parseInt(editText.getText().toString()) == i){
            Toast.makeText(context, "Ваш ответ правильный", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(context, "Ваш ответ не правильный", Toast.LENGTH_SHORT).show();



    }
}
