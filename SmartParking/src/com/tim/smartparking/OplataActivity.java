package com.tim.smartparking;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

/**
 * Created by aleksei on 14.12.15.
 */
public class OplataActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oplata_info);
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(5);
        TextView tv1 = (TextView) findViewById(R.id.textView);
        TextView tv2 = (TextView) findViewById(R.id.textView7);
        TextView tv3 = (TextView) findViewById(R.id.textView8);
<<<<<<< HEAD
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String stayTime = sdf.format(System.currentTimeMillis() - ServerTest.parkTime - 3600 * 1000 * 3);
=======
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String stayTime = sdf.format(System.currentTimeMillis() - ServerTest.parkTime);
>>>>>>> a414b551bdb8c1eeb773c7f9612c72a49c47ccb8
        tv1.setText(stayTime);
    }
}
