package com.example.nichi.mymed.Data;

import android.provider.BaseColumns;

import java.util.Date;

public final class ReminderContract {
    public ReminderContract() {
    }
    public static final class ReminderEntery implements BaseColumns{
        /** Name of database table for medicines */
        public final static String TABLE_NAME = "reminders";

        /**
         * Unique ID number for the medicine (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * FREQUENCY of the REMINDER.
         *
         * Type: TEXT FROM: DAILY, WEEKLY, MONTHLY
         */
        public final static String COLUMN_REMINDER_FREQUENCY ="frequency";

        /**
         * Times per day.
         *
         * Type: INTEGER
         */
        public final static int COLUMN_REMINDER_TIMES = 1;

        public final static String COLUMN_REMINDER_TREATMENT_ID=TreatmentContract.TreatmentEntery._ID;

        public final static String COLUMN_REMINDER_SCHEDULE_ID=ScheduleContract.SchduleEntery._ID;

        public final static String createTable(){
            return "CREATE TABLE " + ReminderContract.ReminderEntery.TABLE_NAME + " ("
                    + ReminderContract.ReminderEntery._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + ReminderContract.ReminderEntery.COLUMN_REMINDER_FREQUENCY+ " INTEGER, "
                    + ReminderContract.ReminderEntery.COLUMN_REMINDER_TIMES+ " INTEGER, "
                    + ReminderContract.ReminderEntery.COLUMN_REMINDER_TREATMENT_ID + " INTEGER, "
                    + ReminderContract.ReminderEntery.COLUMN_REMINDER_SCHEDULE_ID + " INTEGER);";
        }

    }
}
