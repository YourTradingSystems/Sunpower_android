package com.example.SunPower.screens;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.SunPower.R;

/**
 * Created by Denis on 19.02.14.
 */
public final class Home extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
    }

    @Override
    public void onClick(View v) {

    }
}
