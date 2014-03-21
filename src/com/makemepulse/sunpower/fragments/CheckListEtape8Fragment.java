package com.makemepulse.sunpower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 20.02.14.
 */

public final class CheckListEtape8Fragment extends Fragment {

    private RadioButton rbtnTypeConsumption;

    private View returnView;

    public static CheckListEtape8Fragment create() {
        return new CheckListEtape8Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list8, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }

    private void findViews() {
        rbtnTypeConsumption = (RadioButton)getView().findViewById(R.id.rbtnTypeConsumptionVar1_FCL8);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
    }
}
