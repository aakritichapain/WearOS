package com.aakriti.wearos;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView text0;
    private EditText etW;
    private Button btnw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text0 = (TextView) findViewById(R.id.tvOutput);
        etW = (EditText) findViewById(R.id.etW);
        btnw = (Button) findViewById(R.id.btnW);

        // Enables Always-on
        setAmbientEnabled();


        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text0.setText(etW.getText().toString());
            }
        });


    }
}
