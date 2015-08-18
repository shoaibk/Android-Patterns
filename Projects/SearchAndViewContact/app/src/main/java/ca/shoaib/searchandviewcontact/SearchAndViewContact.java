package ca.shoaib.searchandviewcontact;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;

public class SearchAndViewContact extends AppCompatActivity {

    private static final String TAG = SearchAndViewContact.class.getSimpleName();
    TextView contactName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_and_view_contact);
        contactName = (TextView) findViewById(R.id.contact_name);
        handleIntent(getIntent());
        initSearchView();

    }

    @Override
    protected void onNewIntent(Intent intent) {
        // Because this activity has set launchMode="singleTop", the system calls this method
        // to deliver the intent if this activity is currently the foreground activity when
        // invoked again (when the user executes a search from this activity, we don't create
        // a new instance of this activity, so the system delivers the search intent here)
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (ContactsContract.Intents.SEARCH_SUGGESTION_CLICKED.equals(intent.getAction())) {
            String displayName = getContactName(intent);
            Log.d(TAG, "handleIntent: " + displayName);
            contactName.setText(displayName);
        }
    }

    private String getContactName(Intent intent) {
        Log.d(TAG, "Uri = " + intent.getData().toString());
        Cursor phoneCursor = getContentResolver().query(intent.getData(), null, null, null, null);
        phoneCursor.moveToFirst();
        int colNameIndex = phoneCursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
        String contactName = phoneCursor.getString(colNameIndex);
        phoneCursor.close();
        return contactName;
    }

    private void initSearchView() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        final SearchView searchView = (SearchView) findViewById(R.id.searchView);
        SearchableInfo searchableInfo = searchManager.getSearchableInfo(getComponentName());
        searchView.setSearchableInfo(searchableInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_and_view_contact, menu);
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
