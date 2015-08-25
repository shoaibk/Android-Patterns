package ca.shoaib.siteprovider;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentValues values = new ContentValues();
        values.put(SiteContract.SiteEntry.COLUMN_ADDRESS, "www.google.com");
        values.put(SiteContract.SiteEntry.COLUMN_SHORT_NAME, "Google");
        values.put(SiteContract.SiteEntry.COLUMN_IP_ADDRESS, "74.125.226.180");
        values.put(SiteContract.SiteEntry.COLUMN_LOGO_URL,
                "https://upload.wikimedia.org/wikipedia/commons/a/a0/Google_favicon_2012.jpg");

        Uri siteUri = getContentResolver().insert(SiteContract.CONTENT_URI, values);
        Log.d(TAG, "Inserted Site: " + siteUri.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
