package com.example.SunPower.screens.argumentarie;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.example.SunPower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 11:20
 */
abstract class ViewWorker {

    /**
     * initializes ViewPager with indicator
     * load arrays from resources;
     * create adapter, set arrays to adapter, set adapter to view pager
     * prepare indicator and set view pager to it
     * @param _activity
     * @param _vpPager_SA
     */
    protected static final void initPager(final FragmentActivity _activity, final ViewPager _vpPager_SA,
                                          final CirclePageIndicator _cpiIndicator_SA) {
        final Resources resources = _activity.getResources();

        final String[] titles = resources.getStringArray(R.array.arg_titles);
        final String[] messages = resources.getStringArray(R.array.arg_messages);

        final ArgPagerAdapter adapter = ArgPagerAdapter.create(_activity.getSupportFragmentManager());
        adapter.setTitles(titles);
        adapter.setMessages(messages);
        _vpPager_SA.setAdapter(adapter);

        prepateIndicator(resources, _cpiIndicator_SA);
        _cpiIndicator_SA.setViewPager(_vpPager_SA);
    }

    /**
     * Set various parameters to circle indicator.
     * @param _resources for sizes, colors etc
     * @param _cpiIndicator_SA for applying params
     */
    private static final void prepateIndicator(final Resources _resources, final CirclePageIndicator _cpiIndicator_SA) {
        final float radius = _resources.getDimension(R.dimen.radius_indicator);
        final float pageRadius = _resources.getDimension(R.dimen.radius_page_indicator);
        final int distance = _resources.getInteger(R.integer.distance_indicator);
        final int fillColor = _resources.getColor(R.color.selected_indicator);
        final int pageColor = _resources.getColor(R.color.page_indicator);

        _cpiIndicator_SA.setRadius(radius);
        _cpiIndicator_SA.setPageRadius(pageRadius);
        _cpiIndicator_SA.setDistance(distance);
        _cpiIndicator_SA.setFillColor(fillColor);
        _cpiIndicator_SA.setPageColor(pageColor);
        _cpiIndicator_SA.setStrokeWidth(0);
    }
}
