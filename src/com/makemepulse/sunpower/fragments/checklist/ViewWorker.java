package com.makemepulse.sunpower.fragments.checklist;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.makemepulse.sunpower.R;
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

        final CheckListPagerAdapter adapter = CheckListPagerAdapter.create(_activity.getSupportFragmentManager());
        adapter.setFragments(FragmentPool.getFragments());
        _vpPager_SA.setAdapter(adapter);

        final float radius = resources.getDimension(R.dimen.radius_indicator);
        final int distance = resources.getInteger(R.integer.distance_indicator);

        _cpiIndicatior_SA.setRadius(radius);
        _cpiIndicatior_SA.setDistance(distance);
        _cpiIndicatior_SA.setViewPager(_vpPager_SA);
    }
}