package com.example.SunPower.screens.argumentarie;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.View;

import com.example.SunPower.R;
import com.viewpagerindicator.CirclePageIndicator;
import com.example.SunPower.screens.Home;

/**
 * User: ZOG
 * Date: 19.02.14
 * Time: 14:55
 */
public final class Argumentarie extends FragmentActivity  implements View.OnClickListener {

    private RelativeLayout rlRoot_SA;
    private ViewPager vpPager_SA;
    private CirclePageIndicator cpiIndicatior_SA;
    private ActionBar ab_SA;
    private LinearLayout llHome_CAb;
    private LinearLayout llWork_CAb;

    @Override
    public final void onCreate(final Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_argumentarie);

        findViews();
        initActionBar();
        ViewWorker.initPager(this, vpPager_SA, cpiIndicatior_SA);
    }

    private final void findViews() {
        rlRoot_SA           = (RelativeLayout) findViewById(R.id.rlRoot_SA);
        vpPager_SA          = (ViewPager) findViewById(R.id.vpPager_SA);
        cpiIndicatior_SA    = (CirclePageIndicator) findViewById(R.id.cpiIndicatior_SA);
    }

    /**
     *  set the action bar options and custom layout
     */
    private final void initActionBar() {
        ab_SA = getActionBar();
        ab_SA.setDisplayShowHomeEnabled(false);
        ab_SA.setDisplayShowTitleEnabled(false);
        ab_SA.setDisplayShowCustomEnabled(true);

        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflator.inflate(R.layout.custom_action_bar, null);

        llHome_CAb = (LinearLayout)customView.findViewById(R.id.llHome_CAb);
        llHome_CAb.setOnClickListener(this);
        llWork_CAb = (LinearLayout)customView.findViewById(R.id.llWork_CAb);
        llWork_CAb.setOnClickListener(this);

        ab_SA.setCustomView(customView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.llHome_CAb:
                startActivity(new Intent(getBaseContext(), Home.class));
                break;

            case R.id.llWork_CAb:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                break;
        }
    }
}