package com.makemepulse.sunpower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 20.02.14.
 */

public final class CheckListEtape12Fragment extends Fragment {

    private TextView tvValueAddress_FCL12;
    private TextView tvValueOrientation_FCL12;
    private TextView tvValueArea_FCL12;
    private TextView tvValueProduction_FCL12;
    private TextView tvValueIncome_FC12;

    public static CheckListEtape12Fragment create() {
        return new CheckListEtape12Fragment();
    }


    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return  _inflater.inflate(R.layout.fragment_check_list12, _container, false);
    }

    private final void findViews() {
        tvValueAddress_FCL12 = (TextView)getView().findViewById(R.id.tvValueAddress_FCL12);
        tvValueOrientation_FCL12 = (TextView)getView().findViewById(R.id.tvValueOrientation_FCL12);
        tvValueArea_FCL12 = (TextView)getView().findViewById(R.id.tvValueArea_FCL12);
        tvValueProduction_FCL12 = (TextView)getView().findViewById(R.id.tvValueProduction_FCL12);
        tvValueIncome_FC12 = (TextView)getView().findViewById(R.id.tvValueIncome_FCL12);
    }


    public final void setTvValueAddress(final String _value) {
        tvValueAddress_FCL12.setText(_value);
    }

    public final void setTvValueOrientation(final String _value) {
        tvValueOrientation_FCL12.setText(_value);
    }

    public final void setTvValueArea(final String _value) {
        tvValueArea_FCL12.setText(_value);
    }

    public final void setTvValueProduction(final String _value) {
        tvValueProduction_FCL12.setText(_value);
    }

    public final void setTvValueIncome(final String _value) {
        tvValueIncome_FC12.setText(_value);
    }


    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
    }



}
