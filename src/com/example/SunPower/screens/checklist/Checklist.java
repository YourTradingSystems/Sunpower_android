package com.example.SunPower.screens.checklist;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.example.SunPower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 17:02
 */
public final class Checklist extends FragmentActivity {

    private ViewPager vpPager_SC;
    private CirclePageIndicator cpiIndicatior_SC;

    @Override
    public final void onCreate(final Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_checklist);

        findViews();
        FragmentPool.initFragments();
        ViewWorker.initPager(this, vpPager_SC, cpiIndicatior_SC);
    }

    private final void findViews() {
        vpPager_SC          = (ViewPager) findViewById(R.id.vpPager_SC);
        cpiIndicatior_SC    = (CirclePageIndicator) findViewById(R.id.cpiIndicatior_SC);
    }
}