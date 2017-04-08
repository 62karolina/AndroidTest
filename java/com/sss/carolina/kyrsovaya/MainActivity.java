package com.sss.carolina.kyrsovaya;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sss.carolina.kyrsovaya.database.*;

/**@author Carolina
 * @version 1.0*/

public class MainActivity extends AppCompatActivity {

    Button lessonAct;
    Button control;
    Button tests;
    TextView entername;
    final Context context = this;
    AndroidDBHandler androidDBHandler;

    ImageButton bHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        androidDBHandler = new AndroidDBHandler(this);


        lessonAct = (Button) findViewById(R.id.lessonButton);
        lessonAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LessonsActivity.class);
                startActivity(intent);
            }
        });

        control = (Button) findViewById(R.id.control);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ControlActivity.class);
                startActivity(intent);
            }
        });

        tests = (Button) findViewById(R.id.tests);
        tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestsActivity.class);
                startActivity(intent);
            }
        });


        /**
         * setOnclickListener for TextView
         * @see entername*/
        entername = (TextView) findViewById(R.id.enterName);
        entername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Получаем вид с файла prompt.xml, который применим для диалогового окна:
                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.prompt, null);

                //Создаем AlertDialog
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);

                //Настраиваем prompt.xml для нашего AlertDialog:
                mDialogBuilder.setView(promptsView);

                //Настраиваем отображение поля для ввода текста в открытом диалоге:
                final EditText userInput = (EditText) promptsView.findViewById(R.id.input_text);


                //Создание объекта для данных


                //Настраиваем сообщение в диалоговом окне:
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // подключаемся к БД
                                        SQLiteDatabase db = androidDBHandler.getWritableDatabase();

                                        ContentValues cv = new ContentValues();

                                        String name = entername.getText().toString();
                                        //Вводим текст и отображаем в строке ввода на основном экране:
                                        //entername.setText(userInput.getText());
                                        cv.put("name", name);
                                        entername.setText(name);
                                        // вставляем запись и получаем ее ID
                                        long rowID = db.insert("Users", null, cv);
                                        Log.d("Tag", "row inserted, ID = " + rowID);

                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });

                        //Создаем AlertDialog:
                AlertDialog alertDialog = mDialogBuilder.create();

                //и отображаем его:
                alertDialog.show();

            }
        });

        bHelp = (ImageButton)findViewById(R.id.bHelp);
        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Cправка")
                            .setMessage("Приложение предназначено помочь родителям в обучении детей математике")
                            .setCancelable(false)
                            .setNegativeButton("Понятно",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });
                    AlertDialog alert = builder.create();
                    alert.show();
            }
        });


    }


    @Override
    protected void onResume() {
        Log.d("Status", "OnResume");
        //entername.setText(GetName().toString());
       // Log.e("Tag", GetName());
        super.onResume();
    }


    public String GetName(){
        SQLiteDatabase db = androidDBHandler.getWritableDatabase();
        Cursor c = db.query(AndroidDBSchema.UsersTable.UserTable, null, null, null, null, null, null);
        c.moveToLast();
        return c.getString(c.getColumnIndex(AndroidDBSchema.UsersTable.Cols.name));
    }


    @Override
    protected void onDestroy() {
        androidDBHandler.close();
        super.onDestroy();
    }


}
