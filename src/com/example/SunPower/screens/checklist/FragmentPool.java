package com.example.SunPower.screens.checklist;

import android.support.v4.app.Fragment;
import com.example.SunPower.fragments.*;

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

        final CheckListEtape0Fragment etape0 = new CheckListEtape0Fragment();
        final CheckListEtape1Fragment etape1 = new CheckListEtape1Fragment();
        final CheckListEtape2Fragment etape2 = new CheckListEtape2Fragment();
        final CheckListEtape5Fragment etape5 = CheckListEtape5Fragment.create();
        final CheckListEtape11Fragment etape11 = new CheckListEtape11Fragment();
        final CheckListEtape12Fragment etape12 = new CheckListEtape12Fragment();
        final CheckListEtape13Fragment etape13 = CheckListEtape13Fragment.create();
        final CheckListEtape14Fragment etape14 = CheckListEtape14Fragment.create();

        mFragments.add(etape0);
        mFragments.add(etape1);
        mFragments.add(etape2);
        mFragments.add(etape5);
        mFragments.add(etape11);
        mFragments.add(etape12);
        mFragments.add(etape13);
        mFragments.add(etape14);
    }

    protected static final ArrayList<Fragment> getFragments() {
        return mFragments;
    }
}
