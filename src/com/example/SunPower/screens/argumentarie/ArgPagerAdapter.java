package com.example.SunPower.screens.argumentarie;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.SunPower.fragments.argumentarie.ArgPage;

/**
 * adapter for ViewPager, requires arrays titles and messages that
 * must have equals size
 * User: ZOG
 * Date: 19.02.14
 * Time: 17:19
 */
final class ArgPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles;
    private String[] mMessages;

    private ArgPagerAdapter(final FragmentManager _fm) {
        super(_fm);
    }

    /**
     * factory method
     * @param _fm
     * @return
     */
    public static final ArgPagerAdapter create(final FragmentManager _fm) {
        return new ArgPagerAdapter(_fm);
    }

    /**
     * should be setted before setting adapter to pager
     * @param _titles
     */
    public final void setTitles(final String[] _titles) {
        mTitles = _titles;
    }

    /**
     * should be setted before setting adapter to pager
     * @param _messages
     */
    public final void setMessages(final String[] _messages) {
        mMessages = _messages;
    }

    @Override
    public final Fragment getItem(final int _position) {
        final ArgPage fragment = ArgPage.create();
        fragment.setTitle(mTitles[_position]);
        fragment.setMess(mMessages[_position]);
        return fragment;
    }

    /**
     * if arrays are not equals in size that there is no pages
     * @return
     */
    @Override
    public final int getCount() {
        return mTitles.length == mMessages.length ? mTitles.length : 0;
    }
}