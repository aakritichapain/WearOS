package com.aakriti.wearos;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class Countdown extends WearableActivity {

    private TextView tvSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

        tvSeconds = (TextView) findViewById(R.id.tvSeconds);

        // Enables Always-on
        setAmbientEnabled();

        new  CountDownTimer(3000,1000) {


            @Override
            public void onTick(long millisUntilFinished) {
                tvSeconds.setText("Seconds Remaining" + millisUntilFinished);
            }

            @Override
            public void onFinish() {
                tvSeconds.setText("Done");

            }
        }.start();
    }
}
