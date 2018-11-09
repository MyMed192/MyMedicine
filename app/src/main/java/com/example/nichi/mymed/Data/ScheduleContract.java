package com.example.nichi.mymed.Data;

import android.provider.BaseColumns;

import java.sql.Time;
import java.util.Date;

public final class ScheduleContract {
    public ScheduleContract() {
    }
    public static final class SchduleEntery implements BaseColumns{
        /** Name of database table for medicines */
        public final static String TABLE_NAME = "schedules";

        /**
         * Unique ID number for the medicine (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the medicine.
         *
         * Type: TEXT
         */
        public final static Time COLUMN_HOUR = null;


    }
}
