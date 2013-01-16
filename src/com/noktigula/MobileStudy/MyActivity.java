package com.noktigula.MobileStudy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvTitle.setText(R.string.app_name);

        TextView tvSubTitle = (TextView)findViewById(R.id.tvSubTitle);
        tvSubTitle.setText(R.string.explanation);
    }
}
