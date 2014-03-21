package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.makemepulse.sunpower.R;

public final class CheckListEtape4Fragment extends Fragment {

    private String question1;
    private String question2;

    private RadioButton rbtnSimpleRoof_FCL4;
    private RadioButton rbtnAzimuth_FCL4;
    private RadioButton rbtnOriented_FCL4;
    private RadioButton rbtnSimpleSlope_FCL4;
    private RadioButton rbtnSlope45_FCL4;
    private RadioButton rbtnSlope10_FCL4;

    private View returnView;

    public static final CheckListEtape4Fragment create() {
        return new CheckListEtape4Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list4, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
    }

    private final void findViews() {
        rbtnSimpleRoof_FCL4 = (RadioButton) getView().findViewById(R.id.rbtnSimpleRoofVar1_FCL4);
        rbtnAzimuth_FCL4 = (RadioButton) getView().findViewById(R.id.rbtnAzimuthVar1_FCL4);
        rbtnOriented_FCL4 = (RadioButton) getView().findViewById(R.id.rbtnOrientedVar1_FCL4);
        rbtnSimpleSlope_FCL4 = (RadioButton) getView().findViewById(R.id.rbtnSimpleSlopeVar1_FCL4);
        rbtnSlope45_FCL4 = (RadioButton) getView().findViewById(R.id.rbtnSlope45Var1_FCL4);
        rbtnSlope10_FCL4 = (RadioButton) getView().findViewById(R.id.rbtnSlope10Var1_FCL4);
    }

    private void saveAllFragment4Data() {
        if (rbtnSimpleRoof_FCL4.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnAzimuth_FCL4.isChecked()) question2 = "OUI";
        else question2 = "NON";

    }

}
