package com.makemepulse.sunpower.fragments.argumentarie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.makemepulse.sunpower.R;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * User: ZOG
 * Date: 24.02.14
 * Time: 16:22
 */
public final class ArgumentarieFragment extends Fragment {

    private RelativeLayout rlRoot_FA;
    private ViewPager vpPager_FA;
    private CirclePageIndicator cpiIndicator_FA;

    /**
     * inflating layout of fragment
     * @param _inflater system provided inflater
     * @param _container activity's layout
     * @param _savedInstanceState
     * @return inflated view
     */
    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_argumentarie, _container, false);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);

        findViews();
        ViewWorker.initPager(getActivity(), vpPager_FA, cpiIndicator_FA);
    }

    private final void findViews() {
        rlRoot_FA = (RelativeLayout) getView().findViewById(R.id.rlRoot_FA);
        vpPager_FA = (ViewPager) getView().findViewById(R.id.vpPager_FA);
        cpiIndicator_FA = (CirclePageIndicator) getView().findViewById(R.id.cpiIndicator_FA);
    }
}
