package com.makemepulse.sunpower.fragments.checklist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.makemepulse.sunpower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 24.02.14
 * Time: 17:04
 */
public class ChecklistFragment extends Fragment implements ViewPager.OnPageChangeListener {

    private ViewPager vpPager_FC;
    private CirclePageIndicator cpiIndicator_FC;
    private NavigationView nvNavigation_FC;

    /**
     * inflating layout of fragment
     * @param _inflater system provided inflater
     * @param _container activity's layout
     * @param _savedInstanceState
     * @return inflated view
     */
    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_checklist, _container, false);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);

        findViews();
        setListeners();
        FragmentPool.initFragments();
        ViewWorker.initPager(getActivity(), vpPager_FC, cpiIndicator_FC);
        initNavigation(vpPager_FC);
    }

    private final void findViews() {
        vpPager_FC          = (ViewPager) getView().findViewById(R.id.vpPager_FC);
        cpiIndicator_FC     = (CirclePageIndicator) getView().findViewById(R.id.cpiIndicator_FC);
        nvNavigation_FC     = (NavigationView) getView().findViewById(R.id.nvNavigation_FC);
    }

    private final void setListeners() {
        cpiIndicator_FC.setOnPageChangeListener(this);
    }

    private final void initNavigation(final ViewPager _vpPager_SA) {
        nvNavigation_FC.setCount(FragmentPool.getFragments().size());
    }

    //region OnPageChangeListener
    @Override
    public final void onPageScrolled(final int _i, final float _v, final int _i2) {
        nvNavigation_FC.setPosition(_i);
    }

    @Override
    public final void onPageSelected(final int _i) {}

    @Override
    public final void onPageScrollStateChanged(final int _i) {}
    //endregion
}
