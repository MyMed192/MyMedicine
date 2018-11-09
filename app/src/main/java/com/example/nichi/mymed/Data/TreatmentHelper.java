package com.example.nichi.mymed.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TreatmentHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = TreatmentHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "MyMed.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link TreatmentHelper}.
     *
     * @param context of the app
     */
    public TreatmentHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Execute the SQL statement
        db.execSQL(TreatmentContract.TreatmentEntery.onCreate());
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}