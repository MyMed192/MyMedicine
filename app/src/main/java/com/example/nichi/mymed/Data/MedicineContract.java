package com.example.nichi.mymed.Data;

import android.provider.BaseColumns;

import java.util.Date;

public final class MedicineContract {
    public MedicineContract() {
    }
    public static final class MedicineEntery implements BaseColumns{
        /** Name of database table for medicines */
        public final static String TABLE_NAME = "medicines";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_MEDICINE_NAME ="name";

        public final static Date COLUMN_MEDICINE_LIFETIME = new Date();

        public final static int COLUMN_MEDICINE_QUANTITY = 0;

        public final static String COLUMN_MEDICINE_COMMENTS = "comment";

        public final static String createTable() {
            return "CREATE TABLE " + MedicineContract.MedicineEntery.TABLE_NAME + " ("
                    + MedicineContract.MedicineEntery._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + MedicineContract.MedicineEntery.COLUMN_MEDICINE_NAME + " TEXT NOT NULL, "
                    + MedicineContract.MedicineEntery.COLUMN_MEDICINE_LIFETIME + " DATE, "
                    + MedicineContract.MedicineEntery.COLUMN_MEDICINE_QUANTITY + " INTEGER NOT NULL, "
                    + MedicineContract.MedicineEntery.COLUMN_MEDICINE_COMMENTS + " TEXT);";
        }
    }
}
