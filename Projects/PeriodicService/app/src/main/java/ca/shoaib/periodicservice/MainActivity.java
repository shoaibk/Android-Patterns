package ca.shoaib.periodicservice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final long REPEAT_INTERVAL = 5000L; // 5 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scheduleAlarm();
    }

    // Setup a recurring alarm
    public void scheduleAlarm() {

        // Create a PendingIntent to be triggered when the alarm goes off
        // The intent of this PendingIntent will execute the AlarmReceiver
        final PendingIntent pIntent = PendingIntent.getBroadcast(this,
                AlarmReceiver.REQUEST_CODE,
                new Intent(getApplicationContext(), AlarmReceiver.class),
                PendingIntent.FLAG_UPDATE_CURRENT);

        ((AlarmManager) this.getSystemService(Context.ALARM_SERVICE))
                .setInexactRepeating(AlarmManager.RTC_WAKEUP,
                        System.currentTimeMillis(),
                        REPEAT_INTERVAL,
                        pIntent);
    }
}
