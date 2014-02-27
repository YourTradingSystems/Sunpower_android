package com.makemepulse.sunpower.fragments.lead;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.makemepulse.sunpower.R;

/**
 * User: ZOG
 * Date: 27.02.14
 * Time: 12:26
 */
public class LeadStartFragment extends Fragment {

    /**
     * inflating layout of fragment
     * @param _inflater system provided inflater
     * @param _container activity's layout
     * @param _savedInstanceState
     * @return inflated view
     */
    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_lead_start, _container, false);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);

        findViews();
    }

    private final void findViews() {
    }
}
