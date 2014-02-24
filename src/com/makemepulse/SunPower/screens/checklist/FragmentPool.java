package com.makemepulse.sunpower.screens.checklist;

import android.support.v4.app.Fragment;
import com.makemepulse.sunpower.fragments.*;
import com.makemepulse.sunpower.fragments.checklist10.CheckListEtape10Fragment;

import java.util.ArrayList;

/**
 * User: ZOG
 * Date: 20.02.14
 * Time: 17:42
 */
abstract class FragmentPool {
    private static ArrayList<Fragment> mFragments;

    /**
     * add instances to list for checklist screen
     */
    protected static final void initFragments() {
        mFragments = new ArrayList<Fragment>();

        final CheckListEtape0Fragment etape0 = CheckListEtape0Fragment.create();
        final CheckListEtape1Fragment etape1 = CheckListEtape1Fragment.create();
        final CheckListEtape2Fragment etape2 = CheckListEtape2Fragment.create();
        final CheckListEtape4Fragment etape4 = CheckListEtape4Fragment.create();
        final CheckListEtape5Fragment etape5 = CheckListEtape5Fragment.create();
        final CheckListEtape10Fragment etape10 = CheckListEtape10Fragment.create();
        final CheckListEtape11Fragment etape11 = CheckListEtape11Fragment.create();
        final CheckListEtape12Fragment etape12 = CheckListEtape12Fragment.create();
        final CheckListEtape13Fragment etape13 = CheckListEtape13Fragment.create();
        final CheckListEtape14Fragment etape14 = CheckListEtape14Fragment.create();

        mFragments.add(etape0);
        mFragments.add(etape1);
        mFragments.add(etape2);
        mFragments.add(etape4);
        mFragments.add(etape5);
        mFragments.add(etape10);
        mFragments.add(etape11);
        mFragments.add(etape12);
        mFragments.add(etape13);
        mFragments.add(etape14);
    }

    protected static final ArrayList<Fragment> getFragments() {
        return mFragments;
    }
}
