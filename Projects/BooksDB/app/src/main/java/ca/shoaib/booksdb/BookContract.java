package ca.shoaib.booksdb;

import android.provider.BaseColumns;

/**
 * Defines table and column names for the books database.
 */
public class BookContract {
    public static final class BookEntry implements BaseColumns {
        // Table name
        public static final String TABLE_NAME = "book";
        public static final String COLUMN_TITLE = "name";
        public static final String COLUMN_AUTHOR = "author";
        public static final String COLUMN_PRICE = "price";
    }
}
