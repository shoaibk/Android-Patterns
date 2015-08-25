package ca.shoaib.siteprovider;

import android.net.Uri;
import android.provider.BaseColumns;

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