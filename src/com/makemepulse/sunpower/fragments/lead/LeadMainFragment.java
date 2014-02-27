package com.makemepulse.sunpower.fragments.lead;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.makemepulse.sunpower.R;

/**
 * User: ZOG
 * Date: 27.02.14
 * Time: 12:26
 */
public class LeadMainFragment extends Fragment {

    private RelativeLayout rlRoot_FLM;

    /**
     * inflating layout of fragment
     * @param _inflater system provided inflater
     * @param _container activity's layout
     * @param _savedInstanceState
     * @return inflated view
     */
    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_lead_main, _container, false);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);

        findViews();
        addLeadStartFragment();
    }

    private final void findViews() {
        rlRoot_FLM          = (RelativeLayout) getView().findViewById(R.id.rlRoot_FLM);
    }

    private final void addLeadStartFragment() {
        final FragmentTransaction transaction = getFragmentManager().beginTransaction();
        final LeadStartFragment fragment = new LeadStartFragment();
        transaction.add(R.id.rlRoot_FLM, fragment);
        transaction.commit();
    }
}