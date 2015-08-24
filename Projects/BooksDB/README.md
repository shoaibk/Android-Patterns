#### Creating a Book Database

We create an SQLite Database of Books. A Book has a the following information associated:
Title - the name of the book 
Author - the author of the book
Year - the year the book was published

##### Step 0 - Create BookDBHelper
Create the class which extends SQLiteOpenHelper. It contains code to create and upgrade the database, as well as constants such as database name, version etc.

```java
public class BookDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "books.db";
    public static final int DATABASE_VERSION = 1;

    private static final String TABLE_CREATE = "CREATE TABLE " + BookContract.BookEntry.TABLE_NAME +
            " (" +
            BookContract.BookEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            BookContract.BookEntry.COLUMN_TITLE + " TEXT, " +
            BookContract.BookEntry.COLUMN_AUTHOR + " TEXT, " +
            BookContract.BookEntry.COLUMN_PRICE + " INTEGER" +
            ")";
    public BookDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // onCreate is called the first time Database is created
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    // called when db version is changed
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + BookContract.BookEntry.TABLE_NAME);
    }
}
```
