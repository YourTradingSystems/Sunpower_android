package com.example.SunPower.screens.argumentarie;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.View;

import com.example.SunPower.R;
import com.example.SunPower.screens.checklist.Checklist;
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
    private CirclePageIndicator cpiIndicator_SA;
    private ActionBar abPanel;
    private Button btnHome_CAB, btnChecklist_CAB;

    @Override
    public final void onCreate(final Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_argumentarie);

        findViews();
        initActionBar();
        ViewWorker.initPager(this, vpPager_SA, cpiIndicator_SA);
    }

    private final void findViews() {
        rlRoot_SA           = (RelativeLayout) findViewById(R.id.rlRoot_SA);
        vpPager_SA          = (ViewPager) findViewById(R.id.vpPager_SA);
        cpiIndicator_SA     = (CirclePageIndicator) findViewById(R.id.cpiIndicator_SA);
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

        customView.findViewById(R.id.btnArgumentarie_CAB).setVisibility(View.GONE);
        btnChecklist_CAB = (Button)customView.findViewById(R.id.btnChecklist_CAB);
        btnChecklist_CAB.setOnClickListener(this);

        abPanel.setCustomView(customView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnHome_CAB:
                finish();
                break;

            case R.id.btnChecklist_CAB:
                startActivity(new Intent(getBaseContext(), Checklist.class));
                finish();
                break;
        }
    }
}