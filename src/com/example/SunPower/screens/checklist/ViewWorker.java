package com.example.SunPower.screens.checklist;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.example.SunPower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 17:22
 */
abstract class ViewWorker {

    /**
     * initializes ViewPager with indicator
     * load arrays from resources;
     * create adapter, set arrays to adapter, set adapter to view pager
     * @param _activity
     * @param _vpPager_SA
     */
    protected static final void initPager(final FragmentActivity _activity, final ViewPager _vpPager_SA,
                                          final CirclePageIndicator _cpiIndicatior_SA) {
        final Resources resources = _activity.getResources();

//        final ArgPagerAdapter adapter = ArgPagerAdapter.create(_activity.getSupportFragmentManager());
//        adapter.setTitles(titles);
//        adapter.setMessages(messages);
//        _vpPager_SA.setAdapter(adapter);

        final float radius = resources.getDimension(R.dimen.radius_indicator);

//        _cpiIndicatior_SA.setRadius(radius);
//        _cpiIndicatior_SA.setViewPager(_vpPager_SA);
    }
}