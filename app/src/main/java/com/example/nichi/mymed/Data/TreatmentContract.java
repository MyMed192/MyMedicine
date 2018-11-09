package com.example.nichi.mymed.Data;

import android.provider.BaseColumns;

import java.util.Date;

public final class TreatmentContract {
    public TreatmentContract() {
    }
    public static final class TreatmentEntery implements BaseColumns{

        public final static String TABLE_NAME = "treatments";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_TREATMENT_NAME ="name";

        public final static Date COLUMN_TREATMENT_PERIOD_STARTDATE = new Date();

        public final static Date COLUMN_TREATMENT_PERIOD_ENDDATE = new Date();

        public final static String COLUMN_TREATMENT_STATUS = "status";

        public final static String COLUMN_TREATMENT_DESCRIPTION = "description";

        public final static String COLUMN_MEDICINE_ID=MedicineContract.MedicineEntery._ID;

        public final static String onCreate(){
            // Create a String that contains the SQL statement to create the pets table
            return  "CREATE TABLE " + TreatmentContract.TreatmentEntery.TABLE_NAME + " ("
                    + TreatmentContract.TreatmentEntery._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + TreatmentContract.TreatmentEntery.COLUMN_TREATMENT_NAME + " TEXT NOT NULL, "
                    + TreatmentContract.TreatmentEntery.COLUMN_TREATMENT_PERIOD_STARTDATE + " DATE, "
                    + TreatmentContract.TreatmentEntery.COLUMN_TREATMENT_PERIOD_ENDDATE + " DATE, "
                    + TreatmentContract.TreatmentEntery.COLUMN_TREATMENT_STATUS + " TEXT, "
                    + TreatmentContract.TreatmentEntery.COLUMN_TREATMENT_DESCRIPTION + "TEXT"
                    + TreatmentContract.TreatmentEntery.COLUMN_MEDICINE_ID + "INTEGER);";
            }
        }
    }