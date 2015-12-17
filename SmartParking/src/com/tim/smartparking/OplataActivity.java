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

    static TextView tv3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oplata_info);
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(5);
        //NfcAdapter adapter = NfcAdapter.getDefaultAdapter(this);
        TextView tv1 = (TextView) findViewById(R.id.textView);
        TextView tv2 = (TextView) findViewById(R.id.textView7);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long time = System.currentTimeMillis() - ServerTest.parkTime - 3600 * 1000 * 3;
        String stayTime = sdf.format(time);
        sdf = new SimpleDateFormat("HH");
        tv1.setText("Время стоянки: " + stayTime);
        if (Integer.parseInt(sdf.format(time)) < 1) {
            tv2.setText("Первый час на парковке бесплатен!");
            tv3.setText("");
        } else {
            tv2.setText("Стоимость: " + Integer.parseInt(sdf.format(time)) * 100);
        }
        tv2.setText("Стоимость: " + Integer.parseInt(sdf.format(time)) * 100);

    }

}
