package ca.shoaib.periodicservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * An IntentService subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 */
public class PeriodicIntentService extends IntentService {
    public static final String TAG = PeriodicIntentService.class.getSimpleName();

    public PeriodicIntentService() {
        super("PeriodicIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "PeriodicIntentService running");
    }
}
