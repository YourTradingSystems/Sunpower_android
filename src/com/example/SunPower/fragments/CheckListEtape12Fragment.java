package com.example.SunPower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.SunPower.R;

;

/**
 * Created by Eduard on 20.02.14.
 */

public final class CheckListEtape12Fragment extends Fragment {

    private TextView tvValueAddress;
    private TextView tvValueOrientation;
    private TextView tvValueArea;
    private TextView tvValueProduction;
    private TextView tvValueIncome;


    private CheckListEtape12Fragment(){}

    public static CheckListEtape12Fragment create(){
        return new CheckListEtape12Fragment();
    }


    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list12, _container, false);
        return view;
    }

    private void findViews(){
        tvValueAddress = (TextView)getView().findViewById(R.id.tvValueAddress);
        tvValueOrientation = (TextView)getView().findViewById(R.id.tvValueOrientation);
        tvValueArea = (TextView)getView().findViewById(R.id.tvValueArea);
        tvValueProduction = (TextView)getView().findViewById(R.id.tvValueProduction);
    }


    public void setTvValueAddress(final String _value) {
        tvValueAddress.setText(_value);
    }

    public void setTvValueOrientation(final String _value) {
        tvValueOrientation.setText(_value);
    }

    public void setTvValueArea(final String _value) {
        tvValueArea.setText(_value);
    }

    public void setTvValueProduction(final String _value) {
        tvValueProduction.setText(_value);
    }

    public void setTvValueIncome(final String _value) {
        tvValueIncome.setText(_value);
    }


    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
    }



}
