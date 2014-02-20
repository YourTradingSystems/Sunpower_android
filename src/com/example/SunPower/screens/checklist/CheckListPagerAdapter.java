package com.example.SunPower.screens.checklist;

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
     * @param _fm
     * @return
     */
    public static final CheckListPagerAdapter create(final FragmentManager _fm) {
        return new CheckListPagerAdapter(_fm);
    }

    public final void setFragments(final ArrayList<Fragment> _fragmnets) {
        mFragments = _fragmnets;
    }

    @Override
    public final Fragment getItem(final int _position) {
        if (mFragments != null) return mFragments.get(_position);
        return null;
    }

    /**
     * if arrays are not equals in size that there is no pages
     * @return
     */
    @Override
    public final int getCount() {
        if (mFragments != null) return mFragments.size();
        return 0;
    }
}
