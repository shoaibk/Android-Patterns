#### Creating a Book Database

We create an SQLite Database of Books. A Book has a the following information associated:
- Title - the name of the book 
- Author - the author of the book
- Year - the year the book was published

##### Step 0 - Create DBHelper
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
##### Step 1 - Create Contract
 The contract class is the public interface of the database tables. Create the class BookContract and create the nested class BookEntry which implements BaseColumns. This will help later when you expose your database through Content Provider.
 The BookEntry class should define the table name and individual column names as public public static Strings.
 
```java
public class BookContract {
    public static final class BookEntry implements BaseColumns {
        // Table name
        public static final String TABLE_NAME = "book";
        public static final String COLUMN_TITLE = "name";
        public static final String COLUMN_AUTHOR = "author";
        public static final String COLUMN_PRICE = "price";
    }
}
```

##### Step 2 - Use Database from Activity
In MainActivity's onCreate method, create a reference to the Database you just created. Simply making an instance of the database should create it the first time it is called.

```java
BookDBHelper helper = new BookDBHelper(this);
SQLiteDatabase database = helper.getWritableDatabase();
```

##### Step 3 - Check
Open Android Device monitor and check if the database is created. It should be in:
data -> data -> [package_name] -> databases -> books.db

![Screenshot](http://i.imgur.com/EwTOPHo.png)
