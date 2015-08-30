package ca.shoaib.simplereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class HeadsetReceiver extends BroadcastReceiver {

    private static final String TAG = HeadsetReceiver.class.getSimpleName();

    public HeadsetReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle b = intent.getExtras();
        Log.d(TAG, "Headset plugged");
        Log.d(TAG, "Plugged = " + b.getInt("state"));
        Log.d(TAG, "name = " + b.getString("name"));
        Log.d(TAG, "microphone = " + b.getInt("microphone"));

    }
}
