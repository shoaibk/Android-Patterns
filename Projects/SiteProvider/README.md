#### Exposing Database through Content Provider

We create a database containing information about websites - their url, name, ip address, logo. This could be useful for an app that stores data about websites.

##### 1. Create Database
###### a Database Contract
The contract file contains the public interface to the database and content provider.

```java
public class SiteContract {

    public static final String CONTENT_AUTHORITY = "ca.shoaib.siteprovider.sites";
    public static final String BASE_PATH = "site";
    public static final Uri CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY + "/" + BASE_PATH);


    public static final class SiteEntry implements BaseColumns {
        // Table name
        public static final String TABLE_NAME = "site";
        public static final String COLUMN_ADDRESS = "address";
        public static final String COLUMN_SHORT_NAME = "shortname";
        public static final String COLUMN_IP_ADDRESS = "ip_address";
        public static final String COLUMN_LOGO_URL = "logo";
    }
}
```

###### b Create DB Helper
Create the class which extends SQLiteOpenHelper. It contains code to create and upgrade the database, as well as constants such as database name, version etc.

```java
public class SiteDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "sites.db";
    public static final int DATABASE_VERSION = 1;

    private static final String TABLE_CREATE = "CREATE TABLE " + SiteContract.SiteEntry.TABLE_NAME +
            " (" +
            SiteContract.SiteEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            SiteContract.SiteEntry.COLUMN_ADDRESS + " TEXT, " +
            SiteContract.SiteEntry.COLUMN_SHORT_NAME + " TEXT, " +
            SiteContract.SiteEntry.COLUMN_IP_ADDRESS + " TEXT" +
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
```

