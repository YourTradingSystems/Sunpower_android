package com.example.SunPower.screens.argumentarie;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;
import com.example.SunPower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 19.02.14
 * Time: 14:55
 */
public final class Argumentarie extends FragmentActivity {

    private RelativeLayout rlRoot_SA;
    private ViewPager vpPager_SA;
    private CirclePageIndicator cpiIndicatior_SA;

    @Override
    public final void onCreate(final Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_argumentarie);

        findViews();

        ViewWorker.initPager(this, vpPager_SA, cpiIndicatior_SA);
    }

    private final void findViews() {
        rlRoot_SA           = (RelativeLayout) findViewById(R.id.rlRoot_SA);
        vpPager_SA          = (ViewPager) findViewById(R.id.vpPager_SA);
        cpiIndicatior_SA    = (CirclePageIndicator) findViewById(R.id.cpiIndicatior_SA);
    }
}