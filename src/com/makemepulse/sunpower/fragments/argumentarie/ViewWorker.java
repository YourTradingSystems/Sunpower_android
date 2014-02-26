package com.makemepulse.sunpower.fragments.argumentarie;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.makemepulse.sunpower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 24.02.14
 * Time: 16:27
 */
abstract class ViewWorker {

    /**
     * initializes ViewPager with indicator
     * load arrays from resources;
     * create adapter, set arrays to adapter, set adapter to view pager
     * prepare indicator and set view pager to it
     * @param _activity
     * @param _vpPager_FA
     */
    protected static final void initPager(final FragmentActivity _activity, final ViewPager _vpPager_FA,
                                          final CirclePageIndicator _cpiIndicator_FA) {
        final Resources resources = _activity.getResources();

        final String[] titles = resources.getStringArray(R.array.arg_titles);
        final String[] messages = resources.getStringArray(R.array.arg_messages);

        final ArgPagerAdapter adapter = ArgPagerAdapter.create(_activity.getSupportFragmentManager());
        adapter.setTitles(titles);
        adapter.setMessages(messages);
        _vpPager_FA.setAdapter(adapter);

        prepateIndicator(resources, _cpiIndicator_FA);
        _cpiIndicator_FA.setViewPager(_vpPager_FA);
    }

    /**
     * Set various parameters to circle indicator.
     * @param _resources for sizes, colors etc
     * @param _cpiIndicator_FA for applying params
     */
    private static final void prepateIndicator(final Resources _resources, final CirclePageIndicator _cpiIndicator_FA) {
        final float radius = _resources.getDimension(R.dimen.radius_indicator);
        final float pageRadius = _resources.getDimension(R.dimen.radius_page_indicator);
        final int distance = _resources.getInteger(R.integer.distance_indicator);
        final int fillColor = _resources.getColor(R.color.selected_indicator);
        final int pageColor = _resources.getColor(R.color.page_indicator);

        _cpiIndicator_FA.setRadius(radius);
        _cpiIndicator_FA.setPageRadius(pageRadius);
        _cpiIndicator_FA.setDistance(distance);
        _cpiIndicator_FA.setFillColor(fillColor);
        _cpiIndicator_FA.setPageColor(pageColor);
        _cpiIndicator_FA.setStrokeWidth(0);
    }
}
