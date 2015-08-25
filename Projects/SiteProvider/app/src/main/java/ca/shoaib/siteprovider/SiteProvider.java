package ca.shoaib.siteprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class SiteProvider extends ContentProvider {

    private SiteDBHelper mOpenHelper;
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

    @Override
    public boolean onCreate() {
        mOpenHelper = new SiteDBHelper(getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
