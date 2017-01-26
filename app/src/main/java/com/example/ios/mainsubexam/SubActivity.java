package com.example.ios.mainsubexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by in.lee on 2017. 1. 11..
 */

public class SubActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    public void mOnClick(View v)  {
        finish();
    }
}
