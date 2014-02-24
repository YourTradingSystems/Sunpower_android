package com.makemepulse.sunpower.screens.checklist;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.makemepulse.sunpower.R;
import com.makemepulse.sunpower.screens.argumentarie.Argumentarie;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 17:02
 */
public final class Checklist extends FragmentActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private ViewPager vpPager_SC;
    private CirclePageIndicator cpiIndicator_SC;
    private ActionBar abPanel;
    private Button btnHome_CAB, btnArgumentarie_CAB;
    private NavigationView nvNavigation_SC;

    @Override
    public final void onCreate(final Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_checklist);

        findViews();
        setListeners();
        initActionBar();
        FragmentPool.initFragments();
        ViewWorker.initPager(this, vpPager_SC, cpiIndicator_SC);
        initNavigation(vpPager_SC);
    }

    private final void findViews() {
        vpPager_SC          = (ViewPager) findViewById(R.id.vpPager_SC);
        cpiIndicator_SC     = (CirclePageIndicator) findViewById(R.id.cpiIndicator_SC);
        nvNavigation_SC     = (NavigationView) findViewById(R.id.nvNavigation_SC);
    }

    private final void setListeners() {
        cpiIndicator_SC.setOnPageChangeListener(this);
    }

    /**
     *  set the action bar options and custom layout
     */
    private final void initActionBar() {
        abPanel = getActionBar();
        abPanel.setDisplayShowHomeEnabled(false);
        abPanel.setDisplayShowTitleEnabled(false);
        abPanel.setDisplayShowCustomEnabled(true);

        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflator.inflate(R.layout.custom_action_bar, null);

        btnHome_CAB = (Button)customView.findViewById(R.id.btnHome_CAB);
        btnHome_CAB.setOnClickListener(this);

        customView.findViewById(R.id.btnChecklist_CAB).setVisibility(View.GONE);
        btnArgumentarie_CAB = (Button)customView.findViewById(R.id.btnArgumentarie_CAB);
        btnArgumentarie_CAB.setOnClickListener(this);

        abPanel.setCustomView(customView);
    }

    @Override
    public final void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHome_CAB:
                finish();
                break;

            case R.id.btnArgumentarie_CAB:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                finish();
                break;
        }
    }

    private final void initNavigation(final ViewPager _vpPager_SA) {
        nvNavigation_SC.setCount(FragmentPool.getFragments().size());
    }

    //region OnPageChangeListener
    @Override
    public final void onPageScrolled(final int _i, final float _v, final int _i2) {
        nvNavigation_SC.setPosition(_i);
    }

    @Override
    public final void onPageSelected(final int _i) {}

    @Override
    public final void onPageScrollStateChanged(final int _i) {}
    //endregion
}