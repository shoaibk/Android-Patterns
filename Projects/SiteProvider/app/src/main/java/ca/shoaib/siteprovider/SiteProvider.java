package ca.shoaib.siteprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class SiteProvider extends ContentProvider {

    // Constants to identify the requested operation
    static final int SITE = 1;
    static final int SITE_ID = 2;

    private static final UriMatcher sUriMatcher =
            new UriMatcher(UriMatcher.NO_MATCH);
    static {
        final String authority = SiteContract.CONTENT_AUTHORITY;
        final String base = SiteContract.BASE_PATH;
        sUriMatcher.addURI(authority, base, SITE);
        sUriMatcher.addURI(authority, base + "/#", SITE_ID);
    }

    private SiteDBHelper mOpenHelper;

    @Override
    public boolean onCreate() {
        mOpenHelper = new SiteDBHelper(getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return mOpenHelper.getReadableDatabase().query(
                SiteContract.SiteEntry.TABLE_NAME,
                SiteContract.SITE_TABLE_ALL_COLUMNS,
                selection,
                null,
                null,
                null,
                SiteContract.SiteEntry.COLUMN_SHORT_NAME + " DESC"
        );
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        long id = mOpenHelper.getWritableDatabase().insert(
                SiteContract.SiteEntry.TABLE_NAME,
                null,
                values);
        return Uri.parse(SiteContract.BASE_PATH + "/" + id);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return mOpenHelper.getWritableDatabase().delete(
                SiteContract.SiteEntry.TABLE_NAME,
                selection,
                selectionArgs
        );
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return mOpenHelper.getWritableDatabase().update(
                SiteContract.SiteEntry.TABLE_NAME,
                values,
                selection,
                selectionArgs
        );
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

}
