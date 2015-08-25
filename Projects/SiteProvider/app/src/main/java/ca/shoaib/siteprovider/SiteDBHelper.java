package ca.shoaib.siteprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SiteDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "sites.db";
    public static final int DATABASE_VERSION = 1;

    private static final String TABLE_CREATE = "CREATE TABLE " + SiteContract.SiteEntry.TABLE_NAME +
            " (" +
            SiteContract.SiteEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            SiteContract.SiteEntry.COLUMN_ADDRESS + " TEXT, " +
            SiteContract.SiteEntry.COLUMN_SHORT_NAME + " TEXT, " +
            SiteContract.SiteEntry.COLUMN_IP_ADDRESS + " TEXT, " +
            SiteContract.SiteEntry.COLUMN_LOGO_URL + " TEXT" +
            ")";

    private static final String TABLE_UPGRADE = "DROP TABLE IF EXISTS " + SiteContract.SiteEntry.TABLE_NAME;


    public SiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(TABLE_UPGRADE);
    }
}
