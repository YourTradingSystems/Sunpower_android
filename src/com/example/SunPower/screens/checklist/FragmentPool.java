package com.example.SunPower.screens.checklist;

import android.support.v4.app.Fragment;

import java.util.ArrayList;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 17:42
 */
abstract class FragmentPool {
    private static ArrayList<Fragment> mFragments;

    protected static final void initFragments() {
        mFragments = new ArrayList<Fragment>();
    }

    protected static final ArrayList<Fragment> getFragments() {
        return mFragments;
    }
}
