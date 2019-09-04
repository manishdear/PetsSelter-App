package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class PetsDBHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "shelter.db";
    public final static int DATABASE_VERSION = 1;

    public PetsDBHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetsContract.PetsEntry.TABLE_NAME + "("
                + PetsContract.PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetsContract.PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + PetsContract.PetsEntry.COLUMN_PET_BREED + " TEXT, "
                + PetsContract.PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + PetsContract.PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        // Execute the SQL statement
        sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
