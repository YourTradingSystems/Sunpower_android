package com.example.SunPower.screens.argumentarie;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.example.SunPower.R;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 11:20
 */
public abstract class ViewWorker {

    /**
     * load arrays from resources;
     * create adapter, set arrays to adapter, set adapter to view pager
     * @param _activity
     * @param _vpPager_SA
     */
    protected static final void initPager(final FragmentActivity _activity, final ViewPager _vpPager_SA) {
        final Resources resources = _activity.getResources();

        final String[] titles = resources.getStringArray(R.array.arg_titles);
        final String[] messages = resources.getStringArray(R.array.arg_messages);

        final ArgPagerAdapter adapter = new ArgPagerAdapter(_activity.getSupportFragmentManager());
        adapter.setTitles(titles);
        adapter.setMessages(messages);
        _vpPager_SA.setAdapter(adapter);
    }
}
