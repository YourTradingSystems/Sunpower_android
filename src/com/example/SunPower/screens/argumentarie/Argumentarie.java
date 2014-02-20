package com.example.SunPower.screens.argumentarie;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.SunPower.R;
import com.example.SunPower.screens.Home;

import java.util.zip.Inflater;

/**
 * User: ZOG
 * Date: 19.02.14
 * Time: 14:55
 */
public final class Argumentarie extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_argumentarie);
        initActionBar();
    }

    /**
     *  set the action bar options and custom layout
     */
    public final void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflator.inflate(R.layout.custom_action_bar, null);
        customView.findViewById(R.id.btnHome_CAb).setOnClickListener(this);
        customView.findViewById(R.id.btnWork_CAb).setOnClickListener(this);
        actionBar.setCustomView(customView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnHome_CAb:
                // clear the stack of activities and start the home screen
                Intent homeIntent = new Intent(getBaseContext(), Home.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(homeIntent);
                finish();
                break;

            case R.id.btnWork_CAb:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                finish();
                break;
        }
    }
}
