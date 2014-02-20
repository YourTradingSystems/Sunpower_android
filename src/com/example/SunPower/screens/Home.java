package com.example.SunPower.screens;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.SunPower.R;
import com.example.SunPower.screens.argumentarie.Argumentarie;

/**
 * Created by Denis on 19.02.14.
 */
public final class Home extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        initActionBar();
    }

    /**
     *  set the action bar options and custom layout
     */

    public void initActionBar()
    {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflator.inflate(R.layout.custom_action_bar, null);
        customView.findViewById(R.id.btnHome_CAb).setOnClickListener(this);
        customView.findViewById(R.id.btnFaire_CAb).setOnClickListener(this);
        actionBar.setCustomView(customView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnHome_CAb:
                startActivity(new Intent(getBaseContext(), Home.class));
                break;

            case R.id.btnFaire_CAb:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                break;
        }
    }
}
