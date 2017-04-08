package com.sss.carolina.kyrsovaya.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.sss.carolina.kyrsovaya.database.*;
/**
 * Created by carolina on 14.03.17.
 */

public class AndroidDBHandler extends SQLiteOpenHelper {

    private static final String dbName = "androidDB.db";

    public AndroidDBHandler(Context context) {
        super(context, dbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("TAG", "--- onCreate database ---");
        // создаем таблицу с полями
        db.execSQL("create table " + AndroidDBSchema.UsersTable.UserTable + "("
                + AndroidDBSchema.UsersTable.Cols.id_user + " integer primary key autoincrement,"
                + AndroidDBSchema.UsersTable.Cols.name + " string, "
                + AndroidDBSchema.UsersTable.Cols.status_u + " boolean " + ");");

        db.execSQL("create table " + AndroidDBSchema.UsersTable.scoreTable + "("
                + AndroidDBSchema.UsersTable.ColsScore.id_score + " integer primary key autoincrement,"
                + AndroidDBSchema.UsersTable.ColsScore.score + " integer, "
                + AndroidDBSchema.UsersTable.ColsScore.userId + " integer not null, foreign key ("
                + AndroidDBSchema.UsersTable.ColsScore.userId + ") references "
                + AndroidDBSchema.UsersTable.UserTable + " (" + AndroidDBSchema.UsersTable.Cols.id_user + "));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}