package com.makemepulse.sunpower.fragments.checklist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 17:23
 */
final class CheckListPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    private CheckListPagerAdapter(final FragmentManager _fm) {
        super(_fm);
    }

    /**
     * factory method
     * @param _fm FragmentManager for default constructor
     * @return new instance
     */
    public static final CheckListPagerAdapter create(final FragmentManager _fm) {
        return new CheckListPagerAdapter(_fm);
    }

    public final void setFragments(final ArrayList<Fragment> _fragments) {
        mFragments = _fragments;
    }

    @Override
    public final Fragment getItem(final int _position) {
        if (mFragments != null) return mFragments.get(_position);
        return null;
    }

    /**
     * if arrays are not equals in size than there is no pages
     * @return count of pages
     */
    @Override
    public final int getCount() {
        if (mFragments != null) return mFragments.size();
        return 0;
    }
}
